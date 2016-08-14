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
public interface Interface {
    public Matriz somar(Matriz matriz);
    public Matriz multiplicar(Matriz matriz);
    public Matriz multiplicar(int constante);
    public Matriz transposta();
    public ArrayList<Integer> diagD();
    public ArrayList<Integer> diagS();
    public void set(int linha, int coluna, int elemento);
    public Integer get(int linha, int coluna);
    public void setMatriz(Matriz matriz);
}
