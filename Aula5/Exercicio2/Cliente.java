/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5.Exercicio2;

import java.util.List;
/**
 *
 * @author mauricio.moreira
 */
public class Cliente extends Pessoa {
    private String email;
    public List<Venda> vendas;
    
    public Cliente(int codigo, String nome) {
        super(codigo);
        super.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public String getNome() {
        return nome;
    }
    public void addVenda(Venda venda) {
        vendas.add(venda);
    }
}
