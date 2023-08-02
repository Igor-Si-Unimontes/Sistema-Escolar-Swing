
package br.unimontes.ccet.dcc.pg1.model.dao;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Secretaria;


public interface DaoSecretaria extends DAO<Secretaria> {
     boolean verificaloginSecretaria(Secretaria s) throws DAOexception;
}
