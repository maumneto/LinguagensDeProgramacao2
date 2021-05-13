/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula8;

/**
 *
 * @author mauricio.moreira
 */
class Usuario {
    private static int id = 0;
    private String nome;
    
    public Usuario(String nome) {
        this.nome = nome;
        Usuario.incremento();
    }
    
    private static void incremento() {
        id = id + 1;
    }
    public int getId() {
        return Usuario.id;
    }
    //private void setId(int id) {...}
    public String getNome() {
        return nome;
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("mauricio");
        System.out.println("Nome: " + user1.getNome());
        System.out.println("ID: " + user1.getId());
        Usuario user2 = new Usuario("joão");
        System.out.println("Nome: " + user2.getNome());
        System.out.println("ID: " + user2.getId());
        Usuario user3 = new Usuario("cicrano");
        System.out.println("Nome: " + user3.getNome());
        System.out.println("ID: " + user3.getId());
    }
}
