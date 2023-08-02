package br.unimontes.ccet.dcc.pg1.model.dao;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;

import br.unimontes.ccet.dcc.pg1.model.entity.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MateriaDao implements DaoMateria {

    private Connection conn;

    public MateriaDao() throws SQLException {
        conn = DBSingleton.getInstancia().getConexao();
    }

    @Override
    public ArrayList<Materia> consultaMateria(String curso) throws DAOexception {
        ArrayList<Materia> materias = null;
        PreparedStatement st = null;
        try {
            String query = "SELECT * FROM materias WHERE curso LIKE '%" + curso + "%' order by curso";

            st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            if (res != null) {
                materias = new ArrayList<>();
                while (res.next()) {
                    Materia materia = new Materia();
                    materia.setId(res.getString("Id"));
                    materia.setNome(res.getString("Nome"));
                    materia.setPeriodo(res.getInt("Periodo"));
                    materia.setProfessor(res.getString("Professor"));
                    materia.setCurso(res.getString("Curso"));
                    materias.add(materia);

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
        return materias;
    }

    @Override
    public int save(Materia a) throws DAOexception {
        int linhasGravadas = 0;
        try {
            String sQuery = "INSERT INTO materias (id,nome,periodo,professor,curso) Values (?,?,?,?,?)";

            PreparedStatement st = conn.prepareStatement(sQuery);
            st.setString(1, a.getId());
            st.setString(2, a.getNome());
            st.setInt(3, a.getPeriodo());
            st.setString(4, a.getProfessor());
            st.setString(5, a.getCurso());
            linhasGravadas = st.executeUpdate();
        } catch (SQLException ex) {
            if (ex.getSQLState().equals("23505")) {
                JOptionPane.showMessageDialog(null, "Materia já existe !", "Erro", JOptionPane.ERROR_MESSAGE);

                return update(a);
            }
            System.out.println("Erro ao criar materia" + ex);
        }
        return linhasGravadas;
    }

    @Override
    public int update(Materia entidade) throws DAOexception {
        int linhasGravadas = 0;
        try {
            String uQuery = "UPDATE materias SET id  = ?, nome = ?, periodo = ?, professor = ?, curso = ? WHERE id = ?";

            PreparedStatement st = conn.prepareStatement(uQuery);
            st.setString(1, entidade.getId());
            st.setString(2, entidade.getNome());
            st.setInt(3, entidade.getPeriodo());
            st.setString(4, entidade.getProfessor());
            st.setString(5, entidade.getCurso());
            st.setString(6, entidade.getId());

            linhasGravadas = st.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar materia" + ex.getMessage());
        }
        return linhasGravadas;
    }

    @Override
    public int delete(Materia entidade) throws DAOexception {
        int linhasGravadas = 0;
        try {
            String dQuery = "DELETE from materias Where id = ?";
            PreparedStatement st = conn.prepareStatement(dQuery);
            st.setString(1, entidade.getId());
            linhasGravadas = st.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir materia" + ex);
        }
        return linhasGravadas;
    }

    @Override
    public ArrayList<Materia> findAll() throws DAOexception {

        ArrayList<Materia> materias = null;
        PreparedStatement st = null;
        try {
            String query = "SELECT * FROM materias";

            st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            if (res != null) {
                materias = new ArrayList<>();
                while (res.next()) {
                    Materia materia = new Materia();
                    materia.setId(res.getString("Id"));
                    materia.setNome(res.getString("Nome"));
                    materia.setPeriodo(res.getInt("Periodo"));
                    materia.setProfessor(res.getString("Professor"));
                    materia.setCurso(res.getString("Curso"));
                    materias.add(materia);

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
        return materias;

    }

    @Override
    public Materia findOne(Materia entidade) throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Materia> findMateriasByMatricula(String matricula) throws DAOexception {

        ArrayList<Materia> materias = null;
        PreparedStatement st = null;
        try {
            //String query = "SELECT id_materia FROM alunosmaterias WHERE matricula_aluno = ?";
            String query = "SELECT m.id AS id_materia, m.nome AS nome_materia, m.periodo AS periodo_materia FROM alunosmaterias am INNER JOIN materias m ON m.id = am.id_materia WHERE matricula_aluno = ?";

            st = conn.prepareStatement(query);
            st.setString(1, matricula);
            ResultSet res = st.executeQuery();
            if (res != null) {
                materias = new ArrayList<>();
                while (res.next()) {
                    Materia materia = new Materia();
                    materia.setId(res.getString("Id"));
                    materia.setNome(res.getString("Nome"));
                    materia.setPeriodo(res.getInt("Periodo"));
                    materia.setProfessor(res.getString("Professor"));
                    materia.setCurso(res.getString("Curso"));
                    materias.add(materia);
                }
            }
        } catch (SQLException e) {
            throw new DAOexception("Erro ao tentar buscar matérias por matrícula: SQLState: " + e.getMessage());
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                throw new DAOexception("Erro ao tentar fechar a conexão com o banco: SQLState: " + e.getSQLState());
            }
        }
        return materias;
    }

}
