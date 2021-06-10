/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResolucaoNP2;

/**
 *
 * @author mauricio.moreira
 */
abstract class Produto {
    private int id;
    public String nome;
    public double preco;
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    abstract void atualizar(String nome, double preco);
    abstract void mostrarDados();
}

class Brinquedo extends Produto {
    public Brinquedo(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    void atualizar(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
    }
}

public class Questao6 {
    public static void main(String[] args) {
        
    }
}
