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
public class ImovelNovo extends Imovel {
    private double adicional;

    public ImovelNovo(double preco, double adicional) {
        super(preco);
        this.adicional = adicional;
    }
    public double getAdicional () {
        return adicional;
    }
    public double calculoImovelNovo() {
        return getPreco() + adicional;
    }
}
