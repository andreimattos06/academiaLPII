
package entidade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import persistencia.BD;


public class Ficha_Treino {
    
    
    public enum TipoTreino {TreinoA, TreinoB, TreinoC};
    
    private Aluno aluno;
    private Instrutor instrutor;
    private String horario;
    private TipoTreino segunda, terça, quarta, quinta, sexta, sabado;
    private int id;

    public Ficha_Treino(Aluno aluno, Instrutor instrutor, String horario, TipoTreino segunda, TipoTreino terça, TipoTreino quarta, TipoTreino quinta, TipoTreino sexta, TipoTreino sabado) {
        this.aluno = aluno;
        this.instrutor = instrutor;
        this.horario = horario;
        this.segunda = segunda;
        this.terça = terça;
        this.quarta = quarta;
        this.quinta = quinta;
        this.sexta = sexta;
        this.sabado = sabado;
    }
    
     public Ficha_Treino(Aluno aluno, Instrutor instrutor, String horario, TipoTreino segunda, TipoTreino terça, TipoTreino quarta, TipoTreino quinta, TipoTreino sexta, TipoTreino sabado, int id) {
        this.aluno = aluno;
        this.instrutor = instrutor;
        this.horario = horario;
        this.segunda = segunda;
        this.terça = terça;
        this.quarta = quarta;
        this.quinta = quinta;
        this.sexta = sexta;
        this.sabado = sabado;
        this.id = id;
    }

   
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public TipoTreino getQuarta() {
        return quarta;
    }

    public TipoTreino getQuinta() {
        return quinta;
    }

    public TipoTreino getSabado() {
        return sabado;
    }

    public TipoTreino getSexta() {
        return sexta;
    }

    public TipoTreino getSegunda() {
        return segunda;
    }

    public TipoTreino getTerça() {
        return terça;
    }

    public void setQuarta(TipoTreino quarta) {
        this.quarta = quarta;
    }

    public void setQuinta(TipoTreino quinta) {
        this.quinta = quinta;
    }

    public void setSabado(TipoTreino sabado) {
        this.sabado = sabado;
    }

    public void setSegunda(TipoTreino segunda) {
        this.segunda = segunda;
    }

    public void setSexta(TipoTreino sexta) {
        this.sexta = sexta;
    }

    public void setTerça(TipoTreino terça) {
        this.terça = terça;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public static Ficha_Treino buscarFichaTreino(String cpf, String cref){
        ResultSet resultado = null;
        Ficha_Treino ficha = null;
        String sql = null;
        sql = "SELECT id, cpf_aluno, cref_instrutor, horario, segunda, terca, quarta, quinta, sexta, sabado FROM ficha_treino" + " WHERE CPF_ALUNO = ? and CREF_INSTRUTOR = ?";



            try{
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setString(1, cpf);
                comando.setString(2, cref);
                resultado = comando.executeQuery();
                while(resultado.next()){
                    ficha = new Ficha_Treino(Aluno.buscarAluno(cpf), Instrutor.buscarInstrutor(cref), resultado.getString("horario"), 
                                    stringToTipoTreino(resultado.getString("segunda")), stringToTipoTreino(resultado.getString("terca")), stringToTipoTreino(resultado.getString("quarta")), stringToTipoTreino(resultado.getString("quinta")), stringToTipoTreino(resultado.getString("sexta")), stringToTipoTreino(resultado.getString("sabado")), resultado.getInt("id"));
                }
                resultado.close();

            }catch (SQLException exceção){
                exceção.printStackTrace();
                ficha = null;
            }
            return ficha;
    }
    
       
    public static String inserirFichaTreino (Ficha_Treino novo){
        String sql = "INSERT INTO ficha_treino (cpf_aluno, cref_instrutor, horario, segunda, terca, quarta, quinta, sexta, sabado)" + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, novo.getAluno().getCPF());
            comando.setString(2, novo.getInstrutor().getCref());
            comando.setString(3, novo.getHorario());
            comando.setString(4, treinoToString(novo.getSegunda()));
            comando.setString(5, treinoToString(novo.getTerça()));
            comando.setString(6, treinoToString(novo.getQuarta()));
            comando.setString(7, treinoToString(novo.getQuinta()));
            comando.setString(8, treinoToString(novo.getSexta()));
            comando.setString(9, treinoToString(novo.getSabado()));
            comando.executeUpdate();
            comando.close();
            
            return null;
        }catch(SQLException exceção_sql){
            exceção_sql.printStackTrace();
            return "Erro Na Inserção no Banco de Dados";
        }
    }
    
    public static String alterarFicha(Ficha_Treino ficha){
       String sql = "UPDATE Ficha_Treino SET Cpf_Aluno = ?, Cref_Instrutor = ?, Horario = ?, Segunda = ?, Terca = ?, Quarta = ?, Quinta = ?, Sexta = ?, Sabado = ?" + " WHERE ID = ?";
       
       try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, ficha.getAluno().getCPF());
            comando.setString(2, ficha.getInstrutor().getCref());
            comando.setString(3, ficha.getHorario());
            comando.setString(4, treinoToString(ficha.getSegunda()));
            comando.setString(5, treinoToString(ficha.getTerça()));
            comando.setString(6, treinoToString(ficha.getQuarta()));
            comando.setString(7, treinoToString(ficha.getQuinta()));
            comando.setString(8, treinoToString(ficha.getSexta()));
            comando.setString(9, treinoToString(ficha.getSabado()));
            comando.setInt(10, ficha.getId());
            comando.executeUpdate();
            comando.close();
            
            return null;
        }catch(SQLException exceção_sql){
            exceção_sql.printStackTrace();
            return "Erro na Alteração no Banco de Dados";
        }
    }
    
    public static String removerTreino(int id){
        String sql = "DELETE FROM Ficha_Treino" + " WHERE ID = ?";
        
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, id);
            comando.executeUpdate();
            comando.close();
            
            return null;
        }catch(SQLException exceção_sql){
            exceção_sql.printStackTrace();
            return "Erro na Alteração no Banco de Dados";
        }
    }
        
        
        
        
        
        
    public static TipoTreino stringToTipoTreino(String treino){
        if (treino != null){
            if (treino.equalsIgnoreCase("treino A"))
                return TipoTreino.TreinoA;
            else if (treino.equalsIgnoreCase("treino B"))
                return TipoTreino.TreinoB;
            else if (treino.equalsIgnoreCase("treino C"))
                return TipoTreino.TreinoC;
        }
        else
            return null;
        
        return null;
    }
           
   public static String treinoToString(TipoTreino treino){
       if (treino == TipoTreino.TreinoA)
           return "treino a";
       if (treino == TipoTreino.TreinoB)
           return "treino b";
       if (treino == TipoTreino.TreinoC)
           return "treino c";
       else
           return null;
   }
    
    
    
    
    
    
}
