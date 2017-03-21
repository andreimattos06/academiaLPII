
package controlador;

import interfaces.CadastrarAluno;
import entidade.Aluno;

public class ControladorCadastroAluno {
    
    public ControladorCadastroAluno() {
        new CadastrarAluno(this).setVisible(true);
    }
    
    public String inserirAluno (Aluno aluno) {
        Aluno aluno1 = Aluno.buscarAluno ( aluno.getCPF());
        if (aluno1 == null) {
            return Aluno.inserirAluno(aluno);
        } else {
            return "CPF de cliente já cadastrado";
        }
    }
    

    public String alterarAluno (Aluno aluno) {
        Aluno aluno1 = Aluno.buscarAluno ( aluno.getCPF());
        if (aluno1 != null) {
            return Aluno.alterarAluno (aluno);
        } else {
            return "CPF de cliente não cadastrado";
        }
    }
    
    public String removerAluno (Aluno aluno) {
        Aluno aluno1 = Aluno.buscarAluno (aluno.getCPF());
        if (aluno1 != null) {
            return Aluno.removerAluno (aluno);
        } else {
            return "CPF de cliente não cadastrado";
        }
    }
 
 
}

