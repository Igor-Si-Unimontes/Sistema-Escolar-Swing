package br.unimontes.ccet.dcc.pg1.model.entity;

import java.util.*;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.MateriaDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import java.sql.SQLException;

public class Aluno implements Comparable<Aluno> {

    private String matricula;
    private String nome;
    private String dataNascimento;
    private String email;
    private String telefone;
    private String endereço;
    private List<Materia> materias = new ArrayList<Materia>();
    private Curso curso;
    private Status status;

    public Aluno(String matricula, String nome, String dataNascimento, String email, String telefone, String endereço) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.endereço = endereço;
      
    }
    public Aluno(String matricula){
        this.matricula = matricula;
        
    }
    
   
    
    public Aluno(){
        
    }

    public Aluno(String email, String matricula) {
        this.email = email;
        this.matricula = matricula;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
public String toString() {
    // Return a string representation of the Aluno object
    return "Aluno: " + nome + ", Matrícula: " + matricula;
}


    @Override
    public int compareTo(Aluno t) {
        int resultado = dataNascimento.compareTo(t.getDataNascimento());
        if (resultado < 0) {
            return -1;
        } else if (resultado > 0) {
            return 1;
        }
        return 0;
    }

    public boolean logarAluno(Aluno aluno) throws SQLException, DAOexception {

        if (new AlunoDao().verificaloginAluno(aluno)) {
            return true;
        }
        return false;
    }
    public int cadastrarAluno(Aluno aluno) throws SQLException, DAOexception{
        int linhasGravadas = 0;
        new AlunoDao().save(aluno);
        return linhasGravadas;
    }
    
    public int update(Aluno entidade) throws DAOexception, SQLException {
        int linhasAfetadas = 0;
        new AlunoDao().update(entidade);
        return linhasAfetadas;
    }
    
    public int excluirAluno(Aluno aluno)throws SQLException, DAOexception{
        int linhasAfetadas = 0;
        new AlunoDao().delete(aluno);
        return linhasAfetadas;
    }
    
   public ArrayList<Aluno> findAll() throws DAOexception, SQLException {
       return new AlunoDao().findAll();
    }
   public ArrayList<Aluno> consultaMateria(String matricula)throws SQLException, DAOexception {
       return new AlunoDao().consultaMateria(matricula);
    }
   
  public Aluno buscarAluno(String matricula)throws DAOexception, SQLException{
      AlunoDao aluno = new AlunoDao();
      new AlunoDao().buscarAluno(matricula);
       return aluno.buscarAluno(matricula);
      
   }
  
    
}
