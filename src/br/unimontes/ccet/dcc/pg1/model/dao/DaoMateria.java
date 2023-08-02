
package br.unimontes.ccet.dcc.pg1.model.dao;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Professor;
import br.unimontes.ccet.dcc.pg1.model.entity.Materia;
import java.util.ArrayList;


public interface DaoMateria extends DAO<Materia> {
    ArrayList<Materia> consultaMateria(String curso)throws DAOexception;
        public ArrayList<Materia> findMateriasByMatricula(String matricula) throws DAOexception;

}
