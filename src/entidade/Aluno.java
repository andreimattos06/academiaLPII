
package entidade;

import java.util.Date;
import persistencia.BD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import entidade.Endereço;


public class Aluno {
    
private String nome, sobrenome, CPF;
private float peso, altura;
private Endereço endereço;
private Date data_nascimento;

public Aluno(String nome, String sobrenome, String CPF, Date data_nascimento, float peso, float altura, Endereço endereço) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.CPF = CPF;
    this.data_nascimento = data_nascimento;
    this.peso = peso;
    this.altura = altura;
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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    public Endereço getEndereço() {
        return endereço;
    }
    
    public static Aluno buscarAluno(String cpf){
        String sql = "SELECT nome, sobrenome, data_nascimento, peso, altura FROM aluno" + " WHERE CPF = ?";
        ResultSet resultado = null;
        Aluno aluno = null;
       
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cpf);
            resultado = comando.executeQuery();
            while(resultado.next()){
                aluno = new Aluno (resultado.getString("nome"), resultado.getString("sobrenome"), cpf, resultado.getDate("data_nascimento"), resultado.getFloat("peso"), resultado.getFloat("altura"), Endereço.buscarEndereço(cpf, 0) );
            }
            resultado.close();
            
        }catch (SQLException exceção){
            exceção.printStackTrace();
            return null;
        }
        return aluno;
    }
    
    
}
