
package br.unimontes.ccet.dcc.pg1.model.dao;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import br.unimontes.ccet.dcc.pg1.model.entity.AlunosMaterias;
import br.unimontes.ccet.dcc.pg1.model.entity.Materia;
import java.util.ArrayList;


public interface DaoAlunosMaterias extends DAO<AlunosMaterias> {
    ArrayList<AlunosMaterias> consultaMateria(String matricula)throws DAOexception;
}
