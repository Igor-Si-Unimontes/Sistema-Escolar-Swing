/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unimontes.ccet.dcc.pg1.model.dao;

import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import br.unimontes.ccet.dcc.pg1.model.entity.Materia;
import java.util.ArrayList;


public interface DaoAluno extends DAO<Aluno> {
     boolean verificaloginAluno(Aluno aluno) throws DAOexception;
      ArrayList<Aluno> consultaMateria(String matricula)throws DAOexception;
       Aluno buscarAluno(String matricula)throws DAOexception;
}
