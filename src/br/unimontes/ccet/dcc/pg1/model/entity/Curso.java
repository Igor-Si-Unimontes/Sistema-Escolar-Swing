
package br.unimontes.ccet.dcc.pg1.model.entity;
import br.unimontes.ccet.dcc.pg1.model.dao.CursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import java.sql.SQLException;
import java.util.*;

public class Curso {
    private int id;
    private String nome;
    private int periodos;
    private String carga_horaria;
    private List<Aluno>alunos = new ArrayList<Aluno>();
    private List<Materia>materias = new ArrayList<Materia>();

    
    public Curso(){
        
    }
    public Curso(int id, String nome, int periodos, String carga_horaria) {
        this.id = id;
        this.nome = nome;
        this.periodos = periodos;
        this.carga_horaria = carga_horaria;
    }

    public Curso(String nome, int periodos, String carga_horaria) {
        this.nome = nome;
        this.periodos = periodos;
        this.carga_horaria = carga_horaria;
    }

    public Curso(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeriodos() {
        return periodos;
    }

    public void setPeriodos(int periodos) {
        this.periodos = periodos;
    }

    public String getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(String carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public ArrayList<Curso> consultaCurso()throws DAOexception, SQLException {
        return new CursoDao().consultaCurso();
    }
    public int CadastrarCurso(Curso a)throws DAOexception, SQLException {
        int linhasGravadas = 0;
        new CursoDao().save(a);
        return linhasGravadas;
    }
    public int AlterarCurso(Curso entidade)throws DAOexception, SQLException {
        int linhasGravadas = 0;
        new CursoDao().update(entidade);
        return linhasGravadas;
    }
    public int ExcluirCurso(Curso entidade)throws DAOexception, SQLException {
        int linhasGravadas = 0;
        new CursoDao().delete(entidade);
        return linhasGravadas;
    }
    public ArrayList<Curso> findAll() throws DAOexception, SQLException {
         return new CursoDao().findAll();
     }
}
