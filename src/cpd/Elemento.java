/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd;

/**
 *
 * @author estagiario33601
 */
public class Elemento {
    private int linha;
    private int coluna;
    private int valor;

    public Elemento(int linha, int coluna, int valor){
        this.linha = linha;
        this.coluna = coluna;
        this.valor = valor;
    }
    /**
     * @return the linha
     */
    public int getLinha() {
        return linha;
    }
    
    public boolean isPosition(int linha, int coluna){
        return this.linha == linha && this.coluna == coluna;
    }
    /**
     * @param linha the linha to set
     */
    public void setLinha(int linha) {
        this.linha = linha;
    }

    /**
     * @return the coluna
     */
    public int getColuna() {
        return coluna;
    }

    /**
     * @param coluna the coluna to set
     */
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString(){
        return linha+" "+coluna+" "+valor;
    }
}
