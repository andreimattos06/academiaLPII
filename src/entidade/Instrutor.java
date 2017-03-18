
package entidade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import persistencia.BD;


public class Instrutor {
    
private String nome, sobrenome, CPF, cref;
private Date data_nascimento;
private Endereço endereço;

public Instrutor(String nome, String sobrenome, String CPF, Date data_nascimento, String cref, Endereço endereço) {
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

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
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
    String sql = "SELECT nome, cref From Instrutor";
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
        String sql = "SELECT nome, sobrenome, cpf,  data_nascimento FROM Instrutor" + " WHERE CREF = ?";
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
                        resultado.getDate("data_nascimento"),
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

    
}
