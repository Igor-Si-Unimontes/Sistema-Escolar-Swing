
package br.unimontes.ccet.dcc.pg1.model.dao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import java.util.*;


public interface DAO<T>{
   
     int save(T a) throws DAOexception;

    int update(T entidade) throws DAOexception;

    int delete(T entidade) throws DAOexception;

    List<T> findAll() throws DAOexception;

    T findOne(T entidade) throws DAOexception;
}
