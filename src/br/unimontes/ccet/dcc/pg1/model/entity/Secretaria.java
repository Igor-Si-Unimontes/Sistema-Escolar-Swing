
package br.unimontes.ccet.dcc.pg1.model.entity;

import br.unimontes.ccet.dcc.pg1.model.dao.ProfessorDao;
import br.unimontes.ccet.dcc.pg1.model.dao.SecretariaDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import java.sql.SQLException;


public class Secretaria {
    private String email;
    private String senha;

    public Secretaria(){
        
    }
    public Secretaria(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean logarSecretaria(Secretaria secretaria)throws SQLException, DAOexception{
        if(new SecretariaDao().verificaloginSecretaria(secretaria)){
            return true;
        }
        return false;
    }
    
}
