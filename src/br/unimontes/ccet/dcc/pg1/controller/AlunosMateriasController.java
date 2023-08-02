package br.unimontes.ccet.dcc.pg1.controller;

import br.unimontes.ccet.dcc.pg1.model.dao.AlunosMateriaDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import br.unimontes.ccet.dcc.pg1.model.entity.AlunosMaterias;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunosMateriasController {

    public int save(String matricula_aluno, String id_materia, String carga_horaria) throws DAOexception, SQLException {
        int linhasGravadas = 0;
        if (matricula_aluno != null && id_materia != null && carga_horaria != null) {
            AlunosMaterias aMateria = new AlunosMaterias(matricula_aluno, id_materia, carga_horaria);
            aMateria.cadastrarAluno(aMateria);
        }
        return linhasGravadas;
    }

    public int update(AlunosMaterias entidade) throws DAOexception {
        int linhasAfetadas = 0;
        AlunosMaterias aMateria = new AlunosMaterias();
        return linhasAfetadas;
    }

    public int delete(String matricula_aluno,String id_materia) throws DAOexception, SQLException {
        int linhasAfetadas = 0;
        if (matricula_aluno != null && id_materia != null) {
            AlunosMaterias aMateria = new AlunosMaterias(matricula_aluno, id_materia);
            aMateria.excluirAluno(aMateria);
        }
        return linhasAfetadas;
    }

    public ArrayList<AlunosMaterias> findAll() throws DAOexception, SQLException {
        return new AlunosMaterias().findAll();
    }
     
      public ArrayList<AlunosMaterias> consultaMateria(String matricula)throws DAOexception, SQLException{
          return new AlunosMaterias().consultaMateria(matricula);
      }

      
     public static int deleteFrommatricula(String matricula) throws DAOexception {
        int ret;
        try {
            AlunosMateriaDao  acDao = new AlunosMateriaDao();
            ret = acDao.deleteFrommatricula(matricula);
        } catch (SQLException e) {
            throw new DAOexception("Erro ao tentar deletar entidade AlunoCurso. SQLSTATE: " + e.getSQLState());
        }
        return ret;
    }
}
