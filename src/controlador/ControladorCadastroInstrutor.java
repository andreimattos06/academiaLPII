package controlador;
import entidade.Instrutor;

import interfaces.CadastrarInstrutor;

public class ControladorCadastroInstrutor {
    
    public ControladorCadastroInstrutor(){
        new CadastrarInstrutor(this).setVisible(true);
    }
    
    
    public static String inserirInstrutor(Instrutor novo){  
        
         if (Instrutor.buscarInstrutor(novo.getCref()) == null){
             return Instrutor.inserirInstrutor(novo);
         }
         else
            return "CREF já cadastrado.";
        
    };
    
}
