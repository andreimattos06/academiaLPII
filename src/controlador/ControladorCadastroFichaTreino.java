
package controlador;
import entidade.Ficha_Treino;
import interfaces.CadastrarFichaTreino;

public class ControladorCadastroFichaTreino {

    public ControladorCadastroFichaTreino() {
        new CadastrarFichaTreino(this).setVisible(true);
    }
    
    public static String inserirFichaTreino(Ficha_Treino novo){  
        
         if (Ficha_Treino.buscarFichaTreino(novo.getAluno().getCPF(), novo.getInstrutor().getCref()) == null){
             return Ficha_Treino.inserirFichaTreino(novo);
         }
         else
            return "Ficha de treino já cadastrada para o aluno e instrutor.";
    
    
}
}
