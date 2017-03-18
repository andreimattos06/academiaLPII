package controlador;

import interfaces.CadastrarInstrutor;

public class ControladorCadastroInstrutor {
    
    public ControladorCadastroInstrutor(){
        new CadastrarInstrutor(this).setVisible(true);
    }
    
}
