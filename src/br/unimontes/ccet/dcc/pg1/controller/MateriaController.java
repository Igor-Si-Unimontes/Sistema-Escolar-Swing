package br.unimontes.ccet.dcc.pg1.controller;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Materia;
import java.sql.SQLException;
import java.util.ArrayList;

public class MateriaController {

    public ArrayList<Materia> consultaMateria(String curso) throws DAOexception, SQLException {
        return new Materia().consultaMateria(curso);
    }

    public ArrayList<Materia> findAll() throws DAOexception, SQLException {
        return new Materia().findAll();
    }

    public ArrayList<Materia> findMateriasByMatricula(String matricula) throws DAOexception, SQLException {
        return new Materia().findMateriasByMatricula(matricula);
    }
    public int save(String id,String nome,int periodos,String professor,String curso)throws DAOexception, SQLException{
        int linhasGravadas = 0;
        if(id!=null && nome!= null && professor!=null && curso!=null){
            Materia materia = new Materia(id, nome, periodos, professor, curso);
            materia.CadastrarMateria(materia);
        }
        return linhasGravadas;
    }
    public int update(String id,String nome,int periodos,String professor,String curso)throws DAOexception, SQLException{
        int linhasGravadas = 0;
        if(id!=null && nome!= null && periodos!=0 && professor!=null && curso!=null){
            Materia materia = new Materia(id, nome, periodos, professor, curso);
            materia.AlterarMateria(materia);
        }
        return linhasGravadas;
    }
    public int delete(String id)throws DAOexception, SQLException{
        int linhasGravadas = 0;
        if(id!=null){
            Materia materia = new Materia(id);
            materia.ExcluirMateria(materia);
        }
        return linhasGravadas;
    }
}
