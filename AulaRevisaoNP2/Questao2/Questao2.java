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
public class Questao2 {
    public static void main(String args[]) {
        ContaCorrenteSimples conta_mauricio = new ContaCorrenteSimples(1000);
        conta_mauricio.depositar(50);
        System.out.println("Valor do saldo: " + conta_mauricio.saldo());
        conta_mauricio.sacar(50);
        System.out.println("Valor do saldo: " + conta_mauricio.saldo());
        
        ContaCorrenteEspecial conta_especial = new ContaCorrenteEspecial();
        conta_especial.depositar(1000);
        System.out.println("Valor do saldo: " + conta_especial.saldo());
        conta_especial.sacar(50);
        System.out.println("Valor do saldo: " + conta_especial.saldo());      
    }
}
