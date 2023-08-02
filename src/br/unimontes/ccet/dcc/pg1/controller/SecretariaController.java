
package br.unimontes.ccet.dcc.pg1.controller;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Professor;
import br.unimontes.ccet.dcc.pg1.model.entity.Secretaria;
import java.sql.SQLException;

public class SecretariaController {
     public boolean verificaloginScretaria(String email,String senha) throws DAOexception, SQLException {
   if (email.isBlank() == false && email.isEmpty() == false) {
            Secretaria secretaria = new Secretaria(email, senha);
            if(secretaria.logarSecretaria(secretaria)==true){
                return true;
            }
        }
        return false;
    }
}