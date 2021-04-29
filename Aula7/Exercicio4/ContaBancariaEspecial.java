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
public class ContaBancariaEspecial extends ContaBancaria{

    public ContaBancariaEspecial() {
        super();
    }
    public ContaBancariaEspecial(double montante) {
        super(montante);
    }
    @Override
    public void sacar(double quantia) {
        double taxa = 0.001*quantia;
        if (quantia + taxa > montante) {
            System.out.println("Não possui dinheiro suficiente");
        } else  {
            montante = montante - quantia - taxa;
        }
    }
}
