/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import static entidade.Ficha_Treino.stringToTipoTreino;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.BD;

/**
 *
 * @author jeovano
 */
public class FormularioConsulta {
    
    public enum Entidade { ALUNO, INSTRUTOR, FICHA }
    
    private String nome,
                   horario,
                   logradouro,
                   bairro,
                   data;
                   
    
    private Entidade selecionado;

    public FormularioConsulta(String nome, String horario, String logradouro, String bairro, String data, Entidade selecionado) {
        this.nome = nome;
        this.horario = horario;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.data = data;
        this.selecionado = selecionado;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Entidade getSelecionado() {
        return selecionado;
    }

    public void setSelecionado(Entidade selecionado) {
        this.selecionado = selecionado;
    }

        public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public static String Pesquisar(FormularioConsulta form) {
        String sql = null;
        String textoFinal = "";
        
        //ENTIDADE ALUNO
        if(form.getSelecionado() == Entidade.ALUNO) {
            Aluno aluno = null;
            sql = "SELECT * FROM aluno";
            
            try {
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                ResultSet resultado = comando.executeQuery();
                
                while(resultado.next()) {
                    aluno = new Aluno (
                        resultado.getString("nome"),
                        resultado.getString("sobrenome"),
                        resultado.getString("cpf"),
                        Data.toDate(resultado.getString("data_nascimento")),
                        resultado.getFloat("peso"),
                        resultado.getFloat("altura"),
                        Endereço.buscarEndereço(resultado.getString("cpf"), 0) );
                    
                        if( (aluno.getNome().equalsIgnoreCase(form.getNome())|| form.getNome() == null) 
                        &&(aluno.getData_nascimento().toString().equalsIgnoreCase(form.getData())||form.getData()== null)
                        &&(aluno.getEndereço().getBairro().equalsIgnoreCase(form.getBairro())||form.getBairro() == null)
                        &&(aluno.getEndereço().getLogradouro().equalsIgnoreCase(form.getLogradouro()) ||form.getLogradouro() == null ))
                            textoFinal += aluno.toString();;
 
                    
                }
            }
            catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        
        else {
            //ENTIDADE INSTRUTOR
            if(form.getSelecionado() == Entidade.INSTRUTOR) {
                Instrutor instrutor = null;
                sql = "SELECT * FROM instrutor";

                try {
                    PreparedStatement comando = BD.conexão.prepareStatement(sql);
                    ResultSet resultado = comando.executeQuery();

                    while(resultado.next()) {
                        instrutor = new Instrutor ( resultado.getString("nome"),
                        resultado.getString("sobrenome"),
                        resultado.getString("cpf"),
                        Data.toDate(resultado.getString("data_nascimento")),
                        resultado.getString("cref"),
                        Endereço.buscarEndereço(resultado.getString("cref"), 1) );;
                        
                        if( (instrutor.getNome().equalsIgnoreCase(form.getNome())|| form.getNome() == null) 
                        &&(instrutor.getData_nascimento().toString().equalsIgnoreCase(form.getData())||form.getData()== null)
                        &&(instrutor.getEndereço().getBairro().equalsIgnoreCase(form.getBairro())||form.getBairro() == null)
                        &&(instrutor.getEndereço().getLogradouro().equalsIgnoreCase(form.getLogradouro()) ||form.getLogradouro() == null ))
                            textoFinal += instrutor.toString();
                    
                    }
                }
                catch (SQLException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            
            //ENTIDADE FICHA
            else {
                Ficha_Treino ficha = null;
                sql = "SELECT * FROM ficha_treino";

                try {
                    PreparedStatement comando = BD.conexão.prepareStatement(sql);
                    ResultSet resultado = comando.executeQuery();
                  
                    while(resultado.next()) {
                        ficha = new Ficha_Treino(Aluno.buscarAluno(
                                    resultado.getString("cpf_aluno")),
                                    Instrutor.buscarInstrutor(resultado.getString("cref_instrutor")),
                                    resultado.getString("horario"), 
                                    stringToTipoTreino(resultado.getString("segunda")),
                                stringToTipoTreino(resultado.getString("terca")),
                                stringToTipoTreino(resultado.getString("quarta")),
                                stringToTipoTreino(resultado.getString("quinta")),
                                stringToTipoTreino(resultado.getString("sexta")),
                                stringToTipoTreino(resultado.getString("sabado")), 
                                resultado.getInt("id"));
                        
                        if( (ficha.getAluno().getNome().equalsIgnoreCase(form.getNome())||form.getNome() == null) 
                            &&(ficha.getInstrutor().getNome().equalsIgnoreCase(form.getNome())||form.getNome() == null)
                            &&(ficha.getAluno().getData_nascimento().toString().equalsIgnoreCase(form.getData())||form.getData() == null)
                            &&(ficha.getInstrutor().getData_nascimento().toString().equalsIgnoreCase(form.getData())||form.getData() == null)
                            &&(ficha.getAluno().getEndereço().getBairro().equalsIgnoreCase(form.getBairro())||form.getBairro() == null)
                            &&(ficha.getInstrutor().getEndereço().getBairro().equalsIgnoreCase(form.getBairro())||form.getBairro() == null)
                            &&(ficha.getAluno().getEndereço().getLogradouro().equalsIgnoreCase(form.getLogradouro())||form.getLogradouro() == null)
                            &&(ficha.getInstrutor().getEndereço().getLogradouro().equalsIgnoreCase(form.getLogradouro())||form.getLogradouro() == null)
                            &&(ficha.getHorario().equalsIgnoreCase(form.getHorario())||form.getHorario() == null)) {
                            
                            textoFinal += ficha.toString();
                        }

                    }
                }
                catch (SQLException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return textoFinal;
    } 
    
}
