
package entidade;
import java.util.Date;


public class Instrutor {
    
private String nome, sobrenome, CPF;
private Date data_nascimento;
private int cref;
private Endereço endereço;

public Instrutor(String nome, String sobrenome, String CPF, Date data_nascimento, int cref, Endereço endereço) {
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

    public int getCref() {
        return cref;
    }

    public void setCref(int cref) {
        this.cref = cref;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }




    
}
