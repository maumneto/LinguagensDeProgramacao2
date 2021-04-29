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
public class ContaBancaria implements OperacoesBancarias{
    public double montante;

    public ContaBancaria() {
        this.montante = 0;
    }
    public ContaBancaria(double montante) {
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
}
