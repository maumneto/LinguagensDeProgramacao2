/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaRevisaoNP2.Questao2;

/**
 *
 * @author mauricio.moreira
 */
public class ContaCorrenteSimples implements OperacoesBancarias {
    protected double montante;

    public ContaCorrenteSimples() {
        this.montante = 0;
    }

    public ContaCorrenteSimples(double montante) {
        this.montante = montante;
    }
    
    @Override
    public void depositar(double quantia) {
        montante = montante + quantia;
    }
    @Override
    public void sacar(double quantia) {
        double taxa = 0.05*quantia;
        if (quantia + taxa > montante) {
            System.out.println("Não possui dinheiro o suficiente.");
        } else{
            montante = montante - quantia - taxa;
        }
    }
    @Override
    public double saldo() {
        return montante;
    }
}
