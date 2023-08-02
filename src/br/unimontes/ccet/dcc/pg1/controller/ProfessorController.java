package br.unimontes.ccet.dcc.pg1.controller;

import br.unimontes.ccet.dcc.pg1.model.dao.ProfessorDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import br.unimontes.ccet.dcc.pg1.model.entity.Professor;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProfessorController {

    public boolean verificaLoginProfessor(String email, String id) throws DAOexception, SQLException, SQLException {
        if (email.isBlank() == false && email.isEmpty() == false) {
            Professor professor = new Professor(email, id);
            if (professor.logarProfessor(professor) == true) {
                return true;
            }
        }
        return false;
    }

    public int save(String id, String nome, String email, String telefone) throws DAOexception, SQLException {
        int linhasGravadas = 0;
        if (id != null && nome != null && email != null && telefone != null) {
            Professor professor = new Professor(id, nome, email, telefone);
            professor.cadastrarProfessor(professor);

        }
        return linhasGravadas;
    }
    
//    public int update() throws DAOexception {
//            int linhasAfetadas = 0;
//            Professor professor = new Professor();
//        return linhasAfetadas;
//     }
    
    public int delete(String id) throws DAOexception, SQLException {
        int linhasAfetadas = 0;
        if(id!=null){
        Professor professor = new Professor(id);
        professor.excluirProfessor(professor);
       
   } return linhasAfetadas;
}
    
     public ArrayList<Professor> findAll() throws DAOexception, SQLException {
        return new Professor().findAll();
    }
    
}
