/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula7;

/**
 *
 * @author mauricio.moreira
 */
abstract class Produto {
    public String nome;
    public double preco;
    public int id;
    
    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public abstract void atualizar(String nome, double preco);
    public abstract void mostrarDados();
}

class Brinquedo extends Produto {
    Brinquedo(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public void atualizar(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
    }
}

class Bola extends Produto {
    Bola(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public void atualizar(String nome, double preco) {
        super.nome = nome;
        super.preco = preco;
    }
    @Override
    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
    }
}

public class Exercicio1 {
    public static void main(String[] args){
        Produto p1 = new Brinquedo("carrinho", 20f);
        //p1.mostrarDados();
        p1.atualizar("robo", 100.99f);
        p1.mostrarDados();
        p1 = new Bola("Bola Quadrada", 10f);
        p1.mostrarDados();
    } 
}
