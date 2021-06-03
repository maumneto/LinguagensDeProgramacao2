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
public class NovoImovelCorretor extends ImovelNovo {
    private double porcentagem;

    public NovoImovelCorretor(double preco, double adicional, double porcentagem) {
        super(preco, adicional);
        this.porcentagem = porcentagem;
    }
    @Override
    public double calculoImovelNovo() {
        double valor = getPreco() + getAdicional();
        valor = valor + valor*porcentagem;
        return valor;
    }
}
