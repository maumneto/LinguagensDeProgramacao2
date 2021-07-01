/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaRevisaoNP3.Questao1;

/**
 *
 * @author mauricio.moreira
 */
class Conta {
    private double saldo;
    public Conta(){
        this.saldo = 0;
    }
    public Conta(double saldo) {
        this.saldo = saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor) {
        saldo = saldo + valor;
    }
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }
    public void consulta() {
        System.out.println("Valor atual do saldo: " + getSaldo());
    }
    
}

public class Questao1 {
    public static void main(String[] args) {
        Conta conta_mauricio = new Conta();
        conta_mauricio.setSaldo(1000);
        conta_mauricio.consulta();
        conta_mauricio.depositar(100);
        conta_mauricio.consulta();
        conta_mauricio.sacar(500);
        conta_mauricio.consulta();
        conta_mauricio.sacar(700);
    }
}
