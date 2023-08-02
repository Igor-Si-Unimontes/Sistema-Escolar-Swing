package br.unimontes.ccet.dcc.pg1.model.dao;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import br.unimontes.ccet.dcc.pg1.model.entity.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CursoDao implements DaoCurso {

    private Connection conn;

    public CursoDao() throws SQLException {
        conn = DBSingleton.getInstancia().getConexao();
    }

    @Override
    public ArrayList<Curso> consultaCurso() throws DAOexception {

        ArrayList<Curso> cursos = null;
        PreparedStatement st = null;
        try {
            String query = "SELECT * FROM cursos ";

            st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            if (res != null) {
                cursos = new ArrayList<>();
                while (res.next()) {
                    Curso curso = new Curso();
                    curso.setId(res.getInt("id"));
                    curso.setNome(res.getString("nome"));
                    curso.setPeriodos(res.getInt("periodos"));
                    curso.setCarga_horaria(res.getString("carga_horaria"));
                    cursos.add(curso);
                }
            }
        } catch (SQLException e) {
            throw new DAOexception("Erro ao tentar achar curso : SQLState : " + e.getMessage());
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                throw new DAOexception("Erro ao tentar fechar curso : SQLState : " + e.getSQLState());
            }
        }
        return cursos;
    }

    @Override
    public int save(Curso a) throws DAOexception {
        int linhasGravadas = 0;
        try {
            String sQuery = "INSERT INTO cursos(id,nome,periodos,carga_horaria) Values (?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sQuery);
            st.setInt(1, a.getId());
            st.setString(2, a.getNome());
            st.setInt(3, a.getPeriodos());
            st.setString(4, a.getCarga_horaria());
            linhasGravadas = st.executeUpdate();

        } catch (SQLException ex) {
            if (ex.getSQLState().equals("23505")) {
                JOptionPane.showMessageDialog(null, "Curso já existe !", "Erro", JOptionPane.ERROR_MESSAGE);

                return update(a);
            }
            System.out.println("Erro ao criar Curso" + ex);
        }
        return linhasGravadas;
    }

    @Override
    public int update(Curso entidade) throws DAOexception {
        int linhasGravadas = 0;
        try {
            String uQuery = "update cursos set id = ?, nome=?, periodos=?, carga_horaria=? WHERE id = ?";
            PreparedStatement st = conn.prepareStatement(uQuery);
            st.setInt(1, entidade.getId());
            st.setString(2, entidade.getNome());
            st.setInt(3, entidade.getPeriodos());
            st.setString(4, entidade.getCarga_horaria());
            st.setInt(5, entidade.getId());
            linhasGravadas = st.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar curso" + ex);
        }
        return linhasGravadas;
    }

    @Override
    public int delete(Curso entidade) throws DAOexception {
        int linhasGravadas = 0;
        try {
            String delQuery = "DELETE FROM cursos WHERE id = ?";
            PreparedStatement st = conn.prepareStatement(delQuery);
            st.setInt(1, entidade.getId());
            linhasGravadas = st.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar curso" + ex);
        }
        return linhasGravadas;
    }

    @Override
    public ArrayList<Curso> findAll() throws DAOexception {
        ArrayList<Curso> cursos = null;
        PreparedStatement st = null;
        try {
            String query = "SELECT * FROM cursos";

            st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            if (res != null) {
                cursos = new ArrayList<>();
                while (res.next()) {
                    Curso curso = new Curso();
                    curso.setId(res.getInt("Id"));
                    curso.setNome(res.getString("Nome"));
                    curso.setPeriodos(res.getInt("Periodos"));
                    curso.setCarga_horaria(res.getString("Carga_horaria"));
                    cursos.add(curso);

                }
            }
        } catch (SQLException e) {
            throw new DAOexception("Erro ao tentar achar curso : SQLState : " + e.getMessage());
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                throw new DAOexception("Erro ao tentar fechar curso : SQLState : " + e.getSQLState());
            }
        }
        return cursos;
    }

    @Override
    public Curso findOne(Curso entidade) throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
