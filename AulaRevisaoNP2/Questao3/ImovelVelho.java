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
public class ImovelVelho extends Imovel {
    private double desconto;

    public ImovelVelho(double preco, double desconto) {
        super(preco);
        this.desconto = desconto;
    }
    public double getDesconto () {
        return desconto;
    }
    public double calculoImovelVelho() {
        return getPreco() - desconto;
    }
}
