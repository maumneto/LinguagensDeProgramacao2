/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5.Exercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauricio.moreira
 */
public class Funcionario extends Pessoa {
    protected double salario;
    public List<Venda> vendas = new ArrayList<Venda>();
    
    public Funcionario(int codigo, String nome) {
        super(codigo);
        super.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public String getNome() {
        return nome;
    }
    public void addVenda(Venda venda) {
        vendas.add(venda);
    }
    public List<Venda> getVendas() {
        return vendas;
    }
}
