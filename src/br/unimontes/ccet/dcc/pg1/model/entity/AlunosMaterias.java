
package br.unimontes.ccet.dcc.pg1.model.entity;

import br.unimontes.ccet.dcc.pg1.model.dao.AlunoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunosMateriaDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunosMaterias {
    private String matricula_aluno;
    private String id_materia;
    private String carga_horaria;

    public AlunosMaterias(String matricula_aluno, String id_materia) {
        this.matricula_aluno = matricula_aluno;
        this.id_materia = id_materia;
    }

    public AlunosMaterias(String matricula_aluno, String id_materia, String carga_horaria) {
        this.matricula_aluno = matricula_aluno;
        this.id_materia = id_materia;
        this.carga_horaria = carga_horaria;
    }

    public AlunosMaterias(String matricula_aluno) {
        this.matricula_aluno = matricula_aluno;
    }

    public AlunosMaterias() {
    }

    public String getMatricula_aluno() {
        return matricula_aluno;
    }

    public void setMatricula_aluno(String matricula_aluno) {
        this.matricula_aluno = matricula_aluno;
    }

    public String getId_materia() {
        return id_materia;
    }

    public void setId_materia(String id_materia) {
        this.id_materia = id_materia;
    }

    public String getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(String carga_horaria) {
        this.carga_horaria = carga_horaria;
    }
    
    public int cadastrarAluno(AlunosMaterias a) throws SQLException, DAOexception{
        int linhasGravadas = 0;
        new AlunosMateriaDao().save(a);
        return linhasGravadas;
    }
    
    public int update(AlunosMaterias entidade) throws DAOexception, SQLException {
        int linhasAfetadas = 0;
        new AlunosMateriaDao().update(entidade);
        return linhasAfetadas;
    }
    
    public int excluirAluno(AlunosMaterias entidade)throws SQLException, DAOexception{
        int linhasAfetadas = 0;
        new AlunosMateriaDao().delete(entidade);
        return linhasAfetadas;
    }
    
   public ArrayList<AlunosMaterias> findAll() throws DAOexception, SQLException {
       return new AlunosMateriaDao().findAll();
    }
      public ArrayList<AlunosMaterias> consultaMateria(String matricula)throws DAOexception, SQLException{
          return new AlunosMateriaDao().consultaMateria(matricula);
      }

}
