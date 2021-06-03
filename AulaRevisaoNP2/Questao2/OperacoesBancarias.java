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
public interface OperacoesBancarias {
    public void depositar(double quantia);
    public void sacar(double quantia);
    public double saldo();
}
