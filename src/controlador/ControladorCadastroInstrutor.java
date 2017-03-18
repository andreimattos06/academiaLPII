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
    
    public static String removerInstrutor(String cref){
        return Instrutor.removerInstrutor(cref);
    }
    
    public static String alterarInstrutor(Instrutor novo){
        if (Instrutor.buscarInstrutor(novo.getCref()) != null){
            return Instrutor.alterarInstrutor(novo);
        }
        else
            return "CREF não encontrado.";
    }
}
