/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula6.Exercicio1;

/**
 *
 * @author mauricio.moreira
 */
public class ImovelNovoCorretor extends ImovelNovo{
    private double porcentagem;
    
    public ImovelNovoCorretor(double preco, double adicional, double porcentagem) {
        super(preco, adicional);
        this.porcentagem = porcentagem;
    }
    public double calcularImovelNovo() {
        double total = (getPreco() + getAdicional())*porcentagem;
        return total;
    }
}
