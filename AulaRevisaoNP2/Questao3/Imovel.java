/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaRevisaoNP2.Questao3;

/**
 *
 * @author mauricio.moreira
 */
public class Imovel {
   private double preco;
   protected String endereco;

    public Imovel(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
}
