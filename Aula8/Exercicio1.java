/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula8;

/**
 *
 * @author mauricio.moreira
 */
class Conta {
    private double saldo;
    
    Conta() {
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Não é possível sacar");
        } else {
            saldo = saldo - valor;
        }
    }
    public double consultar() {
        return saldo;
    }
}

public class Exercicio1 {
    public static void main (String[] args) {
        Conta conta = new Conta();
        System.out.println(conta.consultar());
        conta.depositar(1000);
        System.out.println(conta.consultar());
        conta.sacar(30);
        System.out.println(conta.consultar());
    }
}
