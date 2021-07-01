/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaRevisaoNP3.Questao2;

/**
 *
 * @author mauricio.moreira
 */
interface OperacoesBancarias {
    public void depositar(double valor);
    public void sacar(double valor);
    public double saldo();
}

class ContaCorrente implements OperacoesBancarias {
    private double montante;

    public ContaCorrente() {
        this.montante = 0;
    }
    public ContaCorrente(double montante) {
        this.montante = montante;
    }
    @Override
    public void depositar(double valor){
        montante = montante + valor; 
    }
    @Override
    public void sacar(double valor) {
        if (montante >= (valor + 0.05*valor)) {
            montante = montante - 1.05*valor;
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }
    public double saldo() {
        return montante;
    }
}

class ContaCorrenteEspecial extends ContaCorrente {
    private double montante;
    public ContaCorrenteEspecial() {
        super();
        this.montante = 0;
    }
    public ContaCorrenteEspecial(double montante) {
        super(montante);
    }
    @Override
    public void sacar(double valor) {
        if (montante >= (valor + 0.01*valor)) {
            montante = montante - 1.01*valor;
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }
    
}

public class Questao2 {
    public static void main(String[] args) {
        
    }
}
