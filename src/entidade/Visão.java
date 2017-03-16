/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Andrei
 */
public class Visão<T> {
    
    T chave;
    String info;
    
    public Visão(T chave, String info) {
        this.chave = chave;
        this.info = info;
    }
    public T getChave() {
        return chave;
    }
    public void setChave(T chave) {
        this.chave = chave;
    }
    
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    @Override
        public String toString () { return info; }

}
