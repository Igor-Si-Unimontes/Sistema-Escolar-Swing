
package br.unimontes.ccet.dcc.pg1.model.dao;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;

import br.unimontes.ccet.dcc.pg1.model.entity.Professor;


public interface DaoProfessor extends DAO<Professor> {
     boolean verificaloginProfessor(Professor p) throws DAOexception;
}
