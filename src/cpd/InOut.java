/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd;

/**
 *
 * @author jean
 */
public class InOut {
    public void imprime(Matriz matriz){
        
        for(int linha=0;linha<matriz.getLinha();linha++){
            System.out.println();
            for(int coluna=0;coluna<matriz.getColuna();coluna++){
                Integer elemento = matriz.get(linha, coluna);
                if(elemento!=null){
                    System.out.print(" "+elemento+" (" + linha+","+ coluna+")");
                }
                
            }
        }
        System.out.println();
        System.out.println();
    }
}
