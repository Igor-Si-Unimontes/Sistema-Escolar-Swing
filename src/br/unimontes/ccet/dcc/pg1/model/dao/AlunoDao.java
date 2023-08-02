package br.unimontes.ccet.dcc.pg1.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import br.unimontes.ccet.dcc.pg1.model.dao.DBSingleton;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import br.unimontes.ccet.dcc.pg1.model.entity.Materia;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlunoDao implements DaoAluno {

    private Connection conn;

    public AlunoDao() throws SQLException {
        conn = DBSingleton.getInstancia().getConexao();
    }

    @Override
    public boolean verificaloginAluno(Aluno aluno) throws DAOexception {
        try {
            //conn = DBSingleton.getInstancia().getConexao();
            Statement st = conn.createStatement();
            ResultSet resultado = st.executeQuery("select * from aluno where email = '" + aluno.getEmail() + "' and matricula = '" + aluno.getMatricula() + "'");
            if (resultado.next()) {
                String usuarioTemp = resultado.getString("email");
                String senhaTemp = resultado.getString("matricula");

                if (senhaTemp.equals(aluno.getMatricula())) {
                    //  AlunosMateriaDao alunos = new AlunosMateriaDao();
                    // return alunos.consultaMateria(senhaTemp);
                    return true;
                    //  AlunosMateriaDao alunos = new AlunosMateriaDao();
                    // return alunos.consultaMateria(senhaTemp);
                }
            }
            return false;
        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar logar aluno : SQLState : " + ex.getSQLState());
        }

    }

    @Override
    public int save(Aluno aluno) throws DAOexception {
        int linhasGravadas = 0;
        try {
            String iQuery = "INSERT INTO aluno (matricula,nome,data_nascimento,email,telefone,endereco) VALUES (?,?,?,?,?,?)";

            PreparedStatement st = conn.prepareStatement(iQuery);
            st.setString(1, aluno.getMatricula());
            st.setString(2, aluno.getNome());
            st.setString(3, aluno.getDataNascimento());
            st.setString(4, aluno.getEmail());
            st.setString(5, aluno.getTelefone());
            st.setString(6, aluno.getEndereço());

            linhasGravadas = st.executeUpdate();
        } catch (SQLException e) {
            if (e.getSQLState().equals("23505")) {
                JOptionPane.showMessageDialog(null, "Aluno ja esta matriculado", "Erro", JOptionPane.ERROR_MESSAGE);

                return update(aluno);
            }
            System.out.println("sim" + e.getMessage());
        }
        return linhasGravadas;

    }

    @Override
    public int update(Aluno entidade) throws DAOexception {
        int linhasAfetadas = 0;

        try {
            String uQuery = "UPDATE aluno SET  nome = ?, data_nascimento = ?, email = ?, telefone = ?, endereco = ? "
                    + "where matricula = ?";

            PreparedStatement st = conn.prepareStatement(uQuery);
            st.setString(1, entidade.getNome());
            st.setString(2, entidade.getDataNascimento());
            st.setString(3, entidade.getEmail());
            st.setString(4, entidade.getTelefone());
            st.setString(5, entidade.getEndereço());
            st.setString(6, entidade.getMatricula());

            linhasAfetadas = st.executeUpdate();

        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar atualizar entidade Aluno. SQLSTATE: " + ex.getMessage());
        }

        return linhasAfetadas;
    }

    @Override
    public int delete(Aluno entidade) throws DAOexception {
        int linhasAfetadas = 0;

        try {
            String delQuery = "DELETE from aluno WHERE matricula = ? ";

            PreparedStatement st = conn.prepareStatement(delQuery);
            st.setString(1, entidade.getMatricula());

            linhasAfetadas = st.executeUpdate();

        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar deletar entidade Aluno SQLSTATE: " + ex.getSQLState());
        }

        return linhasAfetadas;
    }

    @Override
    public ArrayList<Aluno> findAll() throws DAOexception {

        ArrayList<Aluno> aCursos = null;
        PreparedStatement st = null;

        try {
            String query = "SELECT * FROM aluno";
            st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            if (res != null) {
                aCursos = new ArrayList<>();

                while (res.next()) {

                    Aluno aluno = new Aluno();

                    aluno.setMatricula(res.getString("matricula"));
                    aluno.setNome(res.getString("nome"));
                    aluno.setDataNascimento(res.getString("data_nascimento"));
                    aluno.setEmail(res.getString("email"));
                    aluno.setTelefone(res.getString("telefone"));
                    aluno.setEndereço(res.getString("endereco"));

                    aCursos.add(aluno);

                }
            }
        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar encontrar todos Alunos: " + ex.getMessage());
        }

        return aCursos;
    }

    @Override
    public Aluno findOne(Aluno entidade) throws DAOexception {

        return null;
    }

    @Override
    public ArrayList<Aluno> consultaMateria(String matricula) throws DAOexception {
        ArrayList<Aluno> alunos = null;
        PreparedStatement st = null;
        try {
            String query = "SELECT * FROM aluno WHERE matricula = ?";

            st = conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            if (res != null) {
                alunos = new ArrayList<>();
                while (res.next()) {
                    Aluno aluno = new Aluno();
                    aluno.setMatricula(res.getString("matricula"));
                    aluno.setNome(res.getString("nome"));
                    aluno.setDataNascimento(res.getString("data_nascimento"));
                    aluno.setEmail(res.getString("email"));
                    aluno.setTelefone(res.getString("telefone"));
                    aluno.setEndereço(res.getString("endereco"));

                    alunos.add(aluno);
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
        return alunos;
    }

    @Override
    public Aluno buscarAluno(String matricula) throws DAOexception {
        Aluno aluno = new Aluno(matricula);
        try {
            String query = "SELECT * FROM aluno WHERE matricula = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, aluno.getMatricula());
            ResultSet res = st.executeQuery();
            if (res.next()) {
                aluno.setNome(res.getString("nome"));
                return aluno;
            }
        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar encontrar um Aluno: " + ex.getMessage());
        }

        return null;
    }
}
