
package br.unimontes.ccet.dcc.pg1.model.entity;
import br.unimontes.ccet.dcc.pg1.model.dao.MateriaDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import java.sql.SQLException;
import java.util.*;

public class Materia {
    private String id;
    private String nome;
    private int periodo;
    private String professor;
    private String curso;

    public Materia() {

    }
    public Materia(String id){
        this.id = id;
    }
    public Materia(String id, String nome, int periodo, String professor, String curso) {
        this.id = id;
        this.nome = nome;
        this.periodo = periodo;
        this.professor = professor;
        this.curso = curso;
    }

    public Materia(String nome, int periodo, String professor, String curso) {
        this.id = null;
        this.nome = nome;
        this.periodo = periodo;
        this.professor = professor;
        this.curso = curso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public ArrayList<Materia> consultaMateria(String curso)throws SQLException, DAOexception {
        return new MateriaDao().consultaMateria(curso);
    }
     public ArrayList<Materia> findAll() throws DAOexception, SQLException {
         return new MateriaDao().findAll();
     }
     @Override
     public String toString(){
         return this.getNome();
     }
    public ArrayList<Materia> findMateriasByMatricula(String matricula) throws DAOexception, SQLException {
        return new MateriaDao().findMateriasByMatricula(matricula);
    }
    public int CadastrarMateria(Materia a ) throws SQLException, DAOexception{
        int linhasGravadas = 0;
        new MateriaDao().save(a);
        return linhasGravadas;
    }
    public int AlterarMateria(Materia entidade) throws SQLException, DAOexception{
        int linhasGravadas = 0;
        new MateriaDao().update(entidade);
        return linhasGravadas;
    }
    public int ExcluirMateria(Materia entidade) throws SQLException, DAOexception{
        int linhasGravadas = 0;
        new MateriaDao().delete(entidade);
        return linhasGravadas;
    }
}
