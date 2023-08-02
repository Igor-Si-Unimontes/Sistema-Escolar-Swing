package br.unimontes.ccet.dcc.pg1.model.dao;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Secretaria;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class SecretariaDao implements DaoSecretaria {

    private Connection conn;

    public SecretariaDao() throws SQLException {
        conn = DBSingleton.getInstancia().getConexao();
    }

    @Override
    public boolean verificaloginSecretaria(Secretaria s) throws DAOexception {
        try {
            Statement st = conn.createStatement();
            ResultSet resultado = st.executeQuery("select * from secretaria where email = '" + s.getEmail() + "' and senha = '" + s.getSenha()+ "'");
            if (resultado.next()) {
                String usuarioTemp = resultado.getString("email");
                String senhaTemp = resultado.getString("senha");

                if (senhaTemp.equals(s.getSenha())) {
                    return true;
                }
            }
            return false;
        } catch (SQLException ex) {
            throw new DAOexception("Erro ao tentar logar aluno : SQLState : " + ex.getSQLState());
        }

    }

    @Override
    public int save(Secretaria a) throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Secretaria entidade) throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Secretaria entidade) throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Secretaria> findAll() throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Secretaria findOne(Secretaria entidade) throws DAOexception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
