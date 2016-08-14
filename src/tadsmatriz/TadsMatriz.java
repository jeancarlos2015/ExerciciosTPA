/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadsmatriz;


import cpd.InOut;
import cpd.Interface;
import cpd.Matriz;
import cpd.OperacoesMatriz;


/**
 *
 * @author jean
 */
public class TadsMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interface operacao_matriz = new OperacoesMatriz();
        InOut inOut = new InOut();
        Matriz A = new Matriz(3, 3);
        Matriz B = new Matriz(3, 2);
        
        
        
        /*
        1   2   3
        4   5   -1
        11  12  19
        */
        
        A.set(0, 0, 1);
        A.set(0, 1, 2);
        A.set(0, 2, 3);
        
        A.set(1, 0, 4);
        A.set(1, 1, 5);
        A.set(1, 2, -1);
        
        A.set(2, 0, 11);
        A.set(2, 1, 12);
        A.set(2, 2, 19);
        
        /*
        0   2
        4   0
        0   -1
        */
        B.set(0, 0, 0);
        B.set(0, 1, 2);

        B.set(1, 0, 4);
        B.set(1, 1, 0);
        
        
        B.set(2, 0, 0);
        B.set(2, 1, -1);
        
        operacao_matriz.setMatriz(A);
        Matriz C = operacao_matriz.somar(A);
        inOut.imprime(C);
    }
    
}
