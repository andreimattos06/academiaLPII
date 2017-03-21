
package entidade;

import java.sql.Date;
import persistencia.BD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import entidade.Endereço;
import java.util.Vector;


public class Aluno {
    
    private String nome, sobrenome, CPF;
    private float peso, altura;
    private Endereço endereço;
    private Date data_nascimento;

    public static String inserirAluno (Aluno aluno) {
        String sql = "INSERT INTO aluno (nome, sobrenome, CPF, data_nascimento, peso, altura)"
        + " VALUES (?,?,?,?,?,?)";
        String erro;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, aluno.getNome());
            comando.setString(2, aluno.getSobrenome());
            comando.setString(3, aluno.getCPF());
            comando.setDate  (4, aluno.getData_nascimento());
            comando.setFloat (5, aluno.getPeso());
            comando.setFloat (6, aluno.getAltura());

            comando.executeUpdate();
            comando.close();
            Endereço.inserirEndereço(aluno);
            return null;
        }
        catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace ();
            return "Erro na Inserção do Cliente no BD";
        }
    }

    public static Aluno buscarAluno(String cpf){
        String sql = "SELECT nome, sobrenome, data_nascimento, peso, altura  FROM aluno" + " WHERE CPF = ?";
        ResultSet resultado = null;
        Aluno aluno = null;
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cpf);
            resultado = comando.executeQuery();
            while(resultado.next()){
                aluno = new Aluno (
                        resultado.getString("nome"),
                        resultado.getString("sobrenome"),
                        cpf,
                        resultado.getDate("data_nascimento"),
                        resultado.getFloat("peso"),
                        resultado.getFloat("altura"),
                        Endereço.buscarEndereço(cpf, 0) );
            }
            resultado.close();
            
        }catch (SQLException exceção){
            exceção.printStackTrace();
            return null;
        }
        return aluno;
    }
    
    public static String alterarAluno(Aluno aluno) {
        String sql = "UPDATE aluno SET nome = ?, sobrenome = ?, peso = ?,"
                + "altura = ?, data_nascimento = ?"
                + "WHERE cpf = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, aluno.getNome());
            comando.setString(2, aluno.getSobrenome());
            comando.setFloat (3, aluno.getPeso());
            comando.setFloat (4, aluno.getAltura());
            comando.setDate (5, aluno.getData_nascimento());
            
            comando.setString(6, aluno.getCPF());
            comando.executeUpdate(); 
            comando.close();
            
            Endereço.alterarEndereço(aluno);
            return null; //sucesso!
        }
        catch (SQLException e) {
            e.printStackTrace();
            return "Erro ao realizar alteração de dados";
        }
    }
    
    public static String removerAluno(Aluno aluno) {
        String sql = "DELETE FROM aluno WHERE cpf = ?";
        
        try {
            Endereço.removerEndereço(aluno);
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, aluno.getCPF());
            comando.executeUpdate();
            comando.close();
            
            return null; //sucess
        }
        catch (SQLException e) {
            e.printStackTrace();
            return "Erro ao remover Aluno"; //erro
        }
    }
    
    public static Vector<Visão<String>> getVisões() {
    String sql = "SELECT nome, CPF From aluno";
    ResultSet lista_resultados = null;
    Vector<Visão<String>> visões = new Vector<Visão<String>>();
    String cpf = null;
    
    try {
        PreparedStatement comando = BD.conexão.prepareStatement(sql);
        lista_resultados = comando.executeQuery();
        while (lista_resultados.next()) {
            cpf = lista_resultados.getString("cpf");
            visões.addElement(new Visão<String>(cpf,
                    lista_resultados.getString("nome") + " - " + cpf) );
        }
        lista_resultados.close();
        comando.close();
    }
    catch(SQLException e) {
        e.printStackTrace();
    }
    return visões;
}

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
    
    public Visão<String> getVisão() {
        return new Visão<String>(CPF, nome + "-" + CPF );
    }
    
    
    
    
}
