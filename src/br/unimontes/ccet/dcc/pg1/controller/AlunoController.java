package br.unimontes.ccet.dcc.pg1.controller;

import br.unimontes.ccet.dcc.pg1.model.dao.AlunoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.view.paineis.AreaDoAluno;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import br.unimontes.ccet.dcc.pg1.model.entity.Materia;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoController {

    public boolean verificaloginAluno(String email, String matricula) throws DAOexception, SQLException, SQLException {
        if (email.isBlank() == false && email.isEmpty() == false) {
            Aluno aluno = new Aluno(email, matricula);
            if (aluno.logarAluno(aluno) == true) {

                return true;
            }
        }
        return false;
    }

    public int save(String matricula, String nome, String dataNascimento, String email, String telefone, String endereço) throws DAOexception, SQLException {
        int linhasGravadas = 0;
        if (matricula != null && nome != null && dataNascimento != null && email != null && telefone != null && endereço != null) {
            Aluno aluno = new Aluno(matricula, nome, dataNascimento, email, telefone, endereço);
            aluno.cadastrarAluno(aluno);
        }
        return linhasGravadas;
    }

    public int update( String nome, String dataNascimento, String email, String telefone, String endereço,String matricula) throws DAOexception, SQLException {
        int linhasAfetadas = 0;
        if (matricula != null && nome != null && dataNascimento != null && email != null && telefone != null && endereço != null) {
        Aluno aluno = new Aluno();
        aluno.update(aluno);
        }
        return linhasAfetadas;
    }

    public int delete(String matricula) throws DAOexception, SQLException {
        int linhasAfetadas = 0;
        if (matricula != null) {
            Aluno aluno = new Aluno(matricula);
            aluno.excluirAluno(aluno);
        }
        return linhasAfetadas;
    }

    public ArrayList<Aluno> findAll() throws DAOexception, SQLException {
        return new Aluno().findAll();
    }

    public ArrayList<Aluno> consultaMateria(String matricula) throws DAOexception, SQLException {
        return new Aluno().consultaMateria(matricula);
    }

    public Aluno buscarAluno(String matricula)throws DAOexception, SQLException{
        Aluno aluno = new Aluno();
        //aluno = new Aluno().buscarAluno(matricula);
        return aluno.buscarAluno(matricula);
    }
    
}
