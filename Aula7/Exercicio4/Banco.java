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
public class Banco {
    public static void main(String[] args) {
        // conta normal
        ContaBancaria conta_mauricio = new ContaBancaria("Mauricio",1000);
        conta_mauricio.setId(1);
        conta_mauricio.depositar(100);
        conta_mauricio.sacar(50);
        System.out.println("Valor atual do saldo de " + conta_mauricio.getNome() + " : " + conta_mauricio.saldo());
        // conta especial
        ContaBancariaEspecial conta_fulano = new ContaBancariaEspecial("Fulano da Silva");
        conta_fulano.setId(2);
        conta_fulano.depositar(1100);
        conta_fulano.sacar(50);
        System.out.println("Valor atual do saldo de " + conta_fulano.getNome() + " : "+ conta_fulano.saldo());
    }
}
