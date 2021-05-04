/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula7.Exercicio4;

/**
 *
 * @author mauricio.moreira
 */
public class ContaBancaria implements OperacoesBancarias, OperacoesPessoais {
    public double montante;
    public String nome;
    public int id;

    public ContaBancaria(String nome) {
        this.nome = nome;
        this.montante = 0;
    }
    public ContaBancaria(String nome, double montante) {
        this.nome = nome;
        this.montante = montante;
    }
    @Override
    public void depositar(double quantia) {
        montante = montante + quantia;
    }
    @Override
    public void sacar(double quantia) {
        double taxa = 0.005*quantia;
        if (quantia + taxa > montante) {
            System.out.println("Não possui dinheiro suficiente");
        } else  {
            montante = montante - quantia - taxa;
        }
    }
    @Override
    public double saldo(){
        return montante;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public int getId() {
        return id;
    }
}
