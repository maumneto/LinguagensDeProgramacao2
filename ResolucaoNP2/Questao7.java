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
class Funcionario {
    protected String nome;
    private int id;
    
    public Funcionario(String nome) {
        this.nome = nome;
        this.id = 0;
    }
    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
}

class Vendedor extends Funcionario {
    private int qtdVendas;
    
    public Vendedor(String nome) {
        super(nome);
        this.qtdVendas = 0;
    }
    public Vendedor(String nome, int id) {
        super(nome, id);
        this.qtdVendas = 0;
    }
    public void mostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Id: " + getId());
    }
    public void fazerVenda() {
        System.out.println("Venda realizada com sucesso!");
        qtdVendas++;
    }
}

public class Questao7 {
    public static void main(String[] args) {
        
    }
 
}
