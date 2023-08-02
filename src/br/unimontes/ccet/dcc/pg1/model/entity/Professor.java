
package br.unimontes.ccet.dcc.pg1.model.entity;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.ProfessorDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import java.sql.SQLException;
import java.util.*;

public class Professor {
    private String id;
    private String nome;
    private String email;
    private String telefone;
    private Materia materia;
    private List<Aluno>alunos = new ArrayList<Aluno>();

    public Professor(String id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        
    }
    public Professor(String id){
        this.id = id;
    }

    public Professor(String nome, String email, String telefone, Materia materia) {
       
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.materia = materia;
    }

    public Professor(String email,String id) {
        this.email = email;
        this.id = id;
        
    }
    public Professor(){
        
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
     @Override
    public String toString() {
        return "Aluno("+id+") : "+nome;
    }
    public boolean logarProfessor(Professor professor)throws SQLException, DAOexception{
        if(new ProfessorDao().verificaloginProfessor(professor)){
            return true;
        }
        return false;
    }
    public int cadastrarProfessor(Professor professor) throws SQLException, DAOexception{
        int linhasGravadas = 0;
        new ProfessorDao().save(professor);
        return linhasGravadas;
    }
    public int atualizar(Professor entidade) throws DAOexception, SQLException {
        int linhasAfetadas = 0;
        new ProfessorDao().update(entidade);
        return linhasAfetadas;
    }
    
    public int excluirProfessor(Professor entidade) throws DAOexception, SQLException {
        int linhasAfetadas = 0;
        new ProfessorDao().delete(entidade);
        return linhasAfetadas;
    }
     public ArrayList<Professor> findAll() throws DAOexception, SQLException {
       return new ProfessorDao().findAll();
    }
}
