
package controlador;

import interfaces.CadastrarAluno;
import entidade.Aluno;

public class ControladorCadastroAluno {
    
    public ControladorCadastroAluno() {
        new CadastrarAluno(this).setVisible(true);
}   
    
}
