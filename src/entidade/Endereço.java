
package entidade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import persistencia.BD;


public class Endereço {
    
private String logradouro, bairro, CEP, cidade;
private int numero;

public Endereço(String logradouro, String bairro, String CEP, int numero, String cidade) {
    this.logradouro = logradouro;
    this.bairro = bairro;
    this.CEP = CEP;
    this.numero = numero;
    this.cidade = cidade;
}

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }
    
    
    public static Endereço buscarEndereço(String cpf, int id){
        ResultSet resultado = null;
        Endereço endereço = null;
        String sql = null;
        if (id == 0){
            sql = "SELECT logradouro, bairro, numero, cep, cidade FROM enderecoa" + " WHERE CPF = ?";
        }
        
        else{
            sql = "SELECT logradouro, bairro, numero, cidade FROM enderecoi" + " WHERE cref = ?";
        }
            try{
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setString(1, cpf);
                resultado = comando.executeQuery();
                while(resultado.next()){
                    endereço = new Endereço(resultado.getString("logradouro"), resultado.getString("bairro"), resultado.getString("cep"), resultado.getInt("numero"), resultado.getString("cidade"));
                }
                resultado.close();

            }catch (SQLException exceção){
                exceção.printStackTrace();
                endereço = null;
            }
            return endereço;
    }


}
