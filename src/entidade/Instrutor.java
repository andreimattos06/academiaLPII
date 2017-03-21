
package entidade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import entidade.Data;
import java.util.Vector;
import persistencia.BD;
import entidade.Endereço;


public class Instrutor {
    
private String nome, sobrenome, CPF, cref;
private Data data_nascimento;
private Endereço endereço;

public Instrutor(String nome, String sobrenome, String CPF, Data data_nascimento, String cref, Endereço endereço) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.CPF = CPF;
    this.data_nascimento = data_nascimento;
    this.cref = cref;
    this.endereço = endereço;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Data getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Data data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

      
    
    public static Vector<Visão<String>> getVisões() {
    String sql = "SELECT nome, cref From instrutor";
    ResultSet lista_resultados = null;
    Vector<Visão<String>> visões = new Vector<Visão<String>>();
    String cref = null;
    
    try {
        PreparedStatement comando = BD.conexão.prepareStatement(sql);
        lista_resultados = comando.executeQuery();
        while (lista_resultados.next()) {
            cref = lista_resultados.getString("cref");
            visões.addElement(new Visão<String>(cref,
                    lista_resultados.getString("nome") + " - " + cref) );
        }
        lista_resultados.close();
        comando.close();
    }
    catch(SQLException e) {
        e.printStackTrace();
    }
    return visões;
}

    
    public static Instrutor buscarInstrutor(String cref){
        String sql = "SELECT nome, sobrenome, cpf,  data_nascimento FROM instrutor" + " WHERE CREF = ?";
        ResultSet resultado = null;
        Instrutor instrutor = null;
       
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cref);
            resultado = comando.executeQuery();
            while(resultado.next()){
                instrutor = new Instrutor ( resultado.getString("nome"),
                        resultado.getString("sobrenome"),
                        resultado.getString("cpf"),
                        Data.toDate(resultado.getString("data_nascimento")),
                        cref,
                        Endereço.buscarEndereço(cref, 1) );
            }
            resultado.close();
            
        }catch (SQLException exceção){
            exceção.printStackTrace();
            return null;
        }
        return instrutor;
    }
    
    public static String inserirInstrutor (Instrutor novo){
        String sql = "INSERT INTO instrutor (Nome, Sobrenome, Cref, Data_Nascimento, CPF)" + "VALUES(?, ?, ?, ?, ?)";
        
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, novo.getNome());
            comando.setString(2, novo.getSobrenome());
            comando.setString(3, novo.getCref());
            comando.setString(4, novo.getData_nascimento().toString());
            comando.setString(5, novo.getCPF());
            comando.executeUpdate();
            comando.close();
            
            Endereço.inserirEndereço(novo);
            
            return null;
        }catch(SQLException exceção_sql){
            exceção_sql.printStackTrace();
            return "Erro Na Inserção no Banco de Dados";
           
        }
    }
    
    public static String removerInstrutor(String cref){
        String sql = "DELETE FROM instrutor" + " WHERE CREF = ?";
        try{
            Endereço.removerEndereço(cref);
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cref);
            comando.executeUpdate();
            comando.close();            
            return null;
            
        }catch(SQLException exceção){
            exceção.printStackTrace();
            return "Erro na remoção do banco de dados";
        }
    }
     
    public static String alterarInstrutor(Instrutor novo){
        String sql = "UPDATE instrutor SET Nome = ?, Sobrenome = ?, Cref = ?, Data_Nascimento = ?, CPF = ?" + " WHERE CREF = ?";
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, novo.getNome());
            comando.setString(2, novo.getSobrenome());
            comando.setString(4, novo.getData_nascimento().toString());
            comando.setString(5, novo.getCPF());
            comando.setString(6, novo.getCref());
            comando.executeUpdate();
            comando.close();
            
            Endereço.alterarEndereço(novo);
            
            return null;
            
            }catch(SQLException exceção){
            exceção.printStackTrace();
            return "Erro na alteracao do banco de dados";
            }    
        
    }
    
    @Override
    public String toString() {
        return String.format(
                "\n\n---INSTRUTOR---"+
                "\nNome completo: %s"
                + "\nCPF: %s"
                + "\nData-Nascimento: %s"
                + "\nCREF: %s"
                + "\n %s",
                getNome()+" "+getSobrenome(), getCPF(), getData_nascimento().toString(), getCref(), endereço.toString());
    }
}

    

