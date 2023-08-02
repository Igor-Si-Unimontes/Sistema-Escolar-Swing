package br.unimontes.ccet.dcc.pg1.controller;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.sql.SQLException;
import java.util.ArrayList;

public class CursoController {

    public ArrayList<Curso> consultaCurso() throws DAOexception, SQLException {
        return new Curso().consultaCurso();
    }

    public int CadastrarCurso(int id, String nome, int periodos, String carga_horaria) throws DAOexception, SQLException {
        int linhasGravadas = 0;
        if (id != 0 && nome != null && periodos != 0 && carga_horaria != null) {
            Curso curso = new Curso(id, nome, periodos, carga_horaria);
            curso.CadastrarCurso(curso);
        }
        return linhasGravadas;
    }

    public int AlterarCurso(int id,String nome, int periodos, String carga_horaria) throws DAOexception, SQLException {
        int linhasGravadas = 0;
        if (nome != null && periodos != 0 && carga_horaria != null) {
            Curso curso = new Curso(id, nome, periodos, carga_horaria);
            curso.AlterarCurso(curso);
        }
        return linhasGravadas;
    }

    public int ExcluirCurso(int id) throws DAOexception, SQLException {
        int linhasGravadas = 0;
        if (id != 0) {
            Curso curso = new Curso(id);
            curso.ExcluirCurso(curso);
        }
        return linhasGravadas;
    }

    public ArrayList<Curso> findAll() throws DAOexception, SQLException {
        return new Curso().findAll();
    }
}
