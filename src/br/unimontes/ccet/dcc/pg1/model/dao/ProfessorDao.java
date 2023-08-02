
package br.unimontes.ccet.dcc.pg1.model.dao;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import br.unimontes.ccet.dcc.pg1.model.entity.Professor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProfessorDao implements DaoProfessor {

    private Connection conn;

    public ProfessorDao() throws SQLException {
        conn = DBSingleton.getInstancia().getConexao();
    }
    
    @Override
    public boolean verificaloginProfessor(Professor p) throws DAOexception {
        try {
            Statement st = conn.createStatement();
            ResultSet resultado = st.executeQuery("select * from professor where email = '" + p.getEmail() + "' and id = '" + p.getId()+ "'");
            if (resultado.next()) {
                String usuarioTemp = resultado.getString("email");
                String senhaTemp = resultado.getString("id");

                if (senhaTemp.equals(p.getId())) {
                    return true;
                }
            } 
            return false;
        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar logar aluno : SQLState : " + ex.getSQLState());
        }
    }

    @Override
    public int save(Professor a) throws DAOexception {
        int linhasGravadas = 0;
        try {
            String iQuery = "INSERT INTO professor (id,nome,email,telefone) VALUES (?,?,?,?)";

            PreparedStatement st = conn.prepareStatement(iQuery);
            
            st.setString(1, a.getId());
            st.setString(2, a.getNome());
            st.setString(3, a.getEmail());
            st.setString(4, a.getTelefone());

            linhasGravadas = st.executeUpdate();
        } catch (SQLException e) {
            if(e.getSQLState().equals("23505")){
                                JOptionPane.showMessageDialog(null, "Professor ja esta matriculado", "Erro", JOptionPane.ERROR_MESSAGE);

                return update(a);
            }
            System.out.println("sim"+e.getMessage());
        }
        return linhasGravadas;

    }

    @Override
    public int update(Professor entidade) throws DAOexception {
        int linhasAfetadas = 0;

        try {
            String uQuery = "UPDATE professor SET id = ?, nome = ?, email = ?, telefone = ?"
                    + "where matricula = ?";

            PreparedStatement st = conn.prepareStatement(uQuery);
            st.setString(1, entidade.getId());
            st.setString(2, entidade.getNome());
            st.setString(3, entidade.getEmail());
            st.setString(4, entidade.getTelefone());

            linhasAfetadas = st.executeUpdate();

        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar atualizar entidade Professor SQLSTATE: " + ex.getSQLState());
        }

        return linhasAfetadas;
    }

    @Override
    public int delete(Professor entidade) throws DAOexception {
        int linhasAfetadas = 0;

        try {
            String delQuery = "DELETE from professor WHERE id = ? ";

            PreparedStatement st = conn.prepareStatement(delQuery);
            st.setString(1, entidade.getId());
            
            linhasAfetadas = st.executeUpdate();

        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar deletar entidade Professor SQLSTATE: " + ex.getSQLState());
        }

        return linhasAfetadas;
    }

    @Override
    public ArrayList<Professor> findAll() throws DAOexception {
         ArrayList<Professor> aCursos = null;
        PreparedStatement st = null;
        

        try {
            String query = "SELECT * FROM professor";
            st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            if (res != null) {
                aCursos = new ArrayList<>();

                while (res.next()) {
                  Professor professor = new Professor();
                    professor.setId(res.getString("id"));
                    professor.setNome(res.getString("nome"));
                    professor.setEmail(res.getString("email"));
                      professor.setTelefone(res.getString("telefone"));
                    aCursos.add(professor);
                }
            }
        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar encontrar todos Alunos: " + ex.getMessage());
        }

        return aCursos;

    }

    @Override
    public Professor findOne(Professor entidade) throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

