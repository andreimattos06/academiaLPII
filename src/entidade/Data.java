
package entidade;


public class Data {
    
    String dia, mes, ano;

    public Data(String dia, String mes, String ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getAno() {
        return ano;
    }

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

   
    
    public static Data toDate(String data){
       String mes, dia, ano;
       dia = Character.toString(data.charAt(0)) + Character.toString(data.charAt(1));
       mes = Character.toString(data.charAt(3)) + Character.toString(data.charAt(4));
       ano = Character.toString(data.charAt(6)) + Character.toString(data.charAt(7)) + Character.toString(data.charAt(8)) + Character.toString(data.charAt(9));
       return new Data(dia, mes, ano);
    }

@Override   
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }
    
}
