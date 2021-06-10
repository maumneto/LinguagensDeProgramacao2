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
class Conta {
    private double saldo;
    private String nome;
    public Conta(){}
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getNome() {
        return nome;
    }
    public void depositar(double valor) {
        this.saldo = this.saldo + valor*1.1;
    }
}

public class Questao5 {
    public static void main(String[] args) {
        Conta conta_mauricio = new Conta();
        conta_mauricio.setNome("Mauricio");
        conta_mauricio.setSaldo(0);
        conta_mauricio.depositar(1000);
        
        System.out.println("Nome da Conta: " + conta_mauricio.getNome());
        System.out.println("Saldo atual: " + conta_mauricio.getSaldo());
    }
}
