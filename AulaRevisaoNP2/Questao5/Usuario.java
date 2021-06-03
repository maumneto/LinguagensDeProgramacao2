/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaRevisaoNP2.Questao5;

/**
 *
 * @author mauricio.moreira
 */
public class Usuario {
    private static int id = 0;

    public Usuario() {
        incremento();
    }  
    private static void incremento() {
        id++;
    }
    public int getId(){
        return id;
    }
    
}
