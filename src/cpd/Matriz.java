/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd;

import java.util.ArrayList;

/**
 *
 * @author jean
 */
public class Matriz {
    private int linha = 0;
    private int coluna = 0;
    private ArrayList<Elemento> lista;
    private int qt_zeros = 0;
    
    
    public Matriz(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
        lista = new ArrayList();
    }
    
    
    final Elemento getElemento(int linha, int coluna){
        for(Elemento elemento:lista){
            if(elemento.isPosition(linha, coluna)){return elemento;}
        }
        return null;
    }
    
    public void set(int linha, int coluna, int elemento){
        if(elemento!=0){
            Elemento ele = getElemento(linha, coluna);
            if(ele!=null){
                ele.setValor(elemento);
            }else{
                lista.add(new Elemento(linha, coluna, elemento));
            }
        }else{
            qt_zeros++;
        }
    }
    
    public Integer get(int linha, int coluna){
        for(Elemento elemento:lista){
            if(elemento.isPosition(linha, coluna)){return elemento.getValor();}
        }
        if(linha < this.getLinha() && coluna < this.getColuna() && linha >= 0 && coluna >= 0){
            Elemento elemento =  getElemento(linha, coluna);
            if(elemento==null){return 0;}
            
        }
        return null;
    }
    
    
    /**
     * @return the linha
     */
    public int getLinha() {
        return linha;
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
}
