
package br.unimontes.ccet.dcc.pg1.model.dao;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import br.unimontes.ccet.dcc.pg1.model.entity.Materia;
import java.util.ArrayList;


public interface DaoCurso extends DAO<Curso> {
     ArrayList<Curso> consultaCurso()throws DAOexception;
}
