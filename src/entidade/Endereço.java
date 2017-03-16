
package entidade;


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
    
    



}
