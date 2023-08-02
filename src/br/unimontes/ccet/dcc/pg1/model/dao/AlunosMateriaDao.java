
package br.unimontes.ccet.dcc.pg1.model.dao;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import br.unimontes.ccet.dcc.pg1.model.entity.AlunosMaterias;
import br.unimontes.ccet.dcc.pg1.model.entity.Materia;
import com.sun.jdi.connect.spi.Connection;
import java.util.List;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author maylo
 */
public class AlunosMateriaDao implements DAO<AlunosMaterias>{

           private java.sql.Connection conn;

    public AlunosMateriaDao() throws java.sql.SQLException {
        conn = DBSingleton.getInstancia().getConexao();
    }

    @Override
    public int save(AlunosMaterias a) throws DAOexception {
        int linhasGravadas = 0;

        
        try {
            String iQuery = "insert into alunosmaterias values (?,?,?)";

            PreparedStatement st = conn.prepareStatement(iQuery);
            st.setString(1, a.getMatricula_aluno());
            st.setString(2, a.getId_materia());
            st.setString(3, a.getCarga_horaria());
            

            linhasGravadas = st.executeUpdate();
        } catch (java.sql.SQLException e) {
            JOptionPane.showMessageDialog(null, "Aluno ja esta matriculado nesta materia","Erro",JOptionPane.ERROR_MESSAGE);
            System.out.println("sim" + e.getMessage());
            return update(a);
          
        }
        return linhasGravadas;
   
    }

    @Override
    public int update(AlunosMaterias entidade) throws DAOexception {
        int linhasAfetadas = 0;

        try {
            String uQuery = "UPDATE alunosmaterias SET matricula_aluno = ?, id_materia = ?, carga_horaria = ? "
                    + "where matricula_aluno = ? and id_materia = ?";

            PreparedStatement st = conn.prepareStatement(uQuery);
            st.setString(1, entidade.getMatricula_aluno());
            st.setString(2, entidade.getId_materia());
            st.setString(3, entidade.getCarga_horaria());
            st.setString(4, entidade.getMatricula_aluno());
            st.setString(5, entidade.getId_materia());

            linhasAfetadas = st.executeUpdate();

        } catch (java.sql.SQLException ex) {
            throw new DAOexception("Erro ao tentar atualizar entidade AlunoCurso. SQLSTATE: " + ex.getSQLState());
        }

        return linhasAfetadas;
    }

    @Override
    public int delete(AlunosMaterias entidade) throws DAOexception {
        int linhasAfetadas = 0;

        try {
            String delQuery = "DELETE from alunosmaterias WHERE matricula_aluno = ? and id_materia = ?";

            PreparedStatement st = conn.prepareStatement(delQuery);
            st.setString(1, entidade.getMatricula_aluno());
            st.setString(2, entidade.getId_materia());
            linhasAfetadas = st.executeUpdate();

         } catch (java.sql.SQLException ex) {
            throw new DAOexception("Erro ao tentar deletar entidade Aluno SQLSTATE: " + ex.getSQLState());
        }

        return linhasAfetadas;
    }

    @Override
    public ArrayList<AlunosMaterias> findAll() throws DAOexception {
        ArrayList<AlunosMaterias> aCursos = new ArrayList<>();

        try {
            String query = "SELECT * FROM alunosmaterias order by matricula_aluno asc";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            while (res.next()) {
                AlunosMaterias  aCurso = new AlunosMaterias();
                String matricula_aluno = res.getString("matricula_aluno");
                String id_materia = res.getString("id_materia");
                String carga_horaria = res.getString("carga_horaria");
                aCurso.setMatricula_aluno(matricula_aluno);
                aCurso.setId_materia(id_materia);
                aCurso.setCarga_horaria(carga_horaria);
                aCursos.add(aCurso);

            }
         } catch (java.sql.SQLException ex) {
            throw new DAOexception("Erro ao tentar encontrar todos Alunos: " + ex.getMessage());
        }

        return aCursos;
    }

    @Override
    public AlunosMaterias findOne(AlunosMaterias entidade) throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
     public ArrayList<AlunosMaterias> consultaMateria(String matricula)throws DAOexception{
       ArrayList<AlunosMaterias> materias = null;
        PreparedStatement st = null;
        try {
            String query = "SELECT * FROM alunosmaterias WHERE matricula_aluno = ?";

             st = conn.prepareStatement(query);
             st.setString(1, matricula); 
            ResultSet res = st.executeQuery();
            if (res != null) {
                materias = new ArrayList<>();
                while (res.next()) {
                    AlunosMaterias materia = new AlunosMaterias();
                    materia.setMatricula_aluno(res.getString("matricula_aluno"));
                    materia.setId_materia(res.getString("id_materia"));
                    materia.setCarga_horaria(res.getString("carga_horaria"));
                   
                    materias.add(materia);

                }
            }
        } catch (SQLException e) {
            throw new DAOexception("Erro ao tentar achar curso : SQLState : " + e.getMessage());
        }finally{
            try{
                if( st!= null){st.close();}
            }catch (SQLException e) {
            throw new DAOexception("Erro ao tentar fechar curso : SQLState : " + e.getSQLState());
        }
        }
        return materias;
    
     }
     public int deleteFrommatricula(String matricula) throws DAOexception {
        int linhasAfetadas = 0;

        try {
            String delQuery = "DELETE from alunosmaterias WHERE matricula_aluno = ?";

            PreparedStatement st = conn.prepareStatement(delQuery);
            st.setString(1, matricula);
            linhasAfetadas = st.executeUpdate();

        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar deletar entidade AlunoCurso. SQLSTATE: " + ex.getMessage());
        }

        return linhasAfetadas;
    }
}
