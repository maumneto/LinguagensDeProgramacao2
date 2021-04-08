/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5.Exercicio2;

/**
 *
 * @author mauricio.moreira
 */
public class Pessoa {
    private int codigo;
    protected String nome;
    
    public Pessoa(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
}
