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
public class OperacoesMatriz implements Interface{
    private  Matriz matriz;
    
    
    
    //recebe uma matriz A e retorna a soma dela com uma matriz B.
    @Override
    public Matriz somar(Matriz matriz) {
        Matriz nova = new Matriz(matriz.getLinha(), matriz.getColuna());
        if(this.getMatriz().getLinha()==matriz.getLinha() && this.getMatriz().getColuna()==matriz.getColuna()){
            for(int linha=0;linha<matriz.getLinha();linha++){
                for(int coluna = 0;coluna<matriz.getColuna();coluna++){
                     Integer elemento = matriz.get(linha, coluna);
                     Integer elemento2 = this.matriz.get(linha, coluna);
                     if(elemento!=null && elemento2!=null){
                         nova.set(linha, coluna, elemento+ elemento2);
                     }
                }
            }
        }
        return nova;
    }
//recebe uma matriz B retorna o produto dela por uma Matriz A.
    @Override
    public Matriz multiplicar(Matriz matriz) {
        if(this.matriz.getColuna()!=matriz.getLinha()){return null;}
        Matriz nova = new Matriz(this.matriz.getLinha(), matriz.getColuna());
        int soma = 0;
        for(int linha = 0; linha< this.matriz.getLinha();linha++){
            for(int k=0;k<this.matriz.getLinha();k++){
                for(int coluna = 0;coluna<this.matriz.getColuna();coluna++){
                    Integer elemento1 = this.matriz.get(linha, coluna);
                    Integer elemento2 = matriz.get(coluna, k);
                    if(elemento1!=null && elemento2!=null){
                        soma = soma + elemento1*elemento2;
                    }
                    
                }
                nova.set(linha, k, soma);
                soma = 0;
            }
        }
        return nova;        
    }
//multiplica uma matriz por uma constante
    @Override
    public Matriz multiplicar(int constante) {
        Matriz nova = new Matriz(matriz.getLinha(), matriz.getColuna());
        for(int linha = 0; linha< matriz.getLinha();linha++){
            for(int coluna = 0;coluna<matriz.getColuna();coluna++){
                if(matriz.get(linha, coluna)!=null){
                    nova.set(linha, coluna, matriz.get(linha, coluna)*constante);
                }
                
            }                   
        }
        return nova;   
    }
//retorna a transposta de uma matriz
    @Override
    public Matriz transposta() {
        Matriz nova = new Matriz(matriz.getColuna(), matriz.getLinha());
        for(int linha = 0; linha< matriz.getLinha();linha++){
            for(int coluna = 0;coluna<matriz.getColuna();coluna++){
                if(matriz.get(linha, coluna)!=null){
                    nova.set(coluna, linha, matriz.get(linha, coluna));
                }
            }                   
        }
        return nova;
    }
//retorna uma lista contendo os elementos da diagonal principal
    @Override
    public ArrayList<Integer> diagD() {
        ArrayList<Integer> lista = new ArrayList<>();
        for(int linha=0;linha<getMatriz().getLinha();linha++){
            for(int coluna = 0;coluna< getMatriz().getColuna();coluna++){
                if(linha == coluna){
                    if(matriz.get(linha, coluna)!=null){
                        lista.add(matriz.get(linha, coluna));
                    }
                }
                
            }
        }
        return lista;
    }
//retorna uma lista contendo os elementos da diagonal secundaria
    @Override
    public ArrayList<Integer> diagS() {
        ArrayList<Integer> lista = new ArrayList<>();
        for(int linha=0;linha<getMatriz().getLinha();linha++){
            for(int coluna = 0;coluna< getMatriz().getColuna();coluna++){
                if(linha + coluna == getMatriz().getColuna()-1){
                    if(matriz.get(linha, coluna)!=null){
                        lista.add(matriz.get(linha, coluna));
                    }
                    
                }
                
            }
        }
        return lista;
    }
    
    @Override
    public void set(int linha, int coluna, int elemento) {
        getMatriz().set(linha, coluna, elemento);
    }
    
   
    @Override
    public Integer get(int linha, int coluna) {
        return getMatriz().get(linha, coluna);
    }

    /**
     * @return the matriz
     */
    public Matriz getMatriz() {
        return matriz;
    }

    /**
     * @param matriz é a entrada que será usada nas operacoes de soma,
     * multiplicação, transpota com o parâmetro dessas funções.
     */
    @Override
    public void setMatriz(Matriz matriz) {
        this.matriz = matriz;
    }
    
}
