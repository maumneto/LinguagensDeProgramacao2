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
        this.montante = this.montante + valor;
    }
    @Override
    public void sacar(double valor){
        double taxa = 0.05*valor;
        if (montante < valor + taxa) {
            System.out.println("Não possui crédito suficiente.");
        } else {
            this.montante = this.montante - valor - taxa;
        }
    }
    @Override
    public double saldo(){
        return montante;
    }
}

public class Questao8 {
    public static void main(String[] args) {
        
    }
}
