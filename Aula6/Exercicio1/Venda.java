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
public class Venda {
    public static void main(String[] args) {
        ImovelNovo predio1 = new ImovelNovo(100000, 20000);
        System.out.println(predio1.calcularImovelNovo());
        predio1 = new ImovelNovoCorretor(100000, 20000, 1.1);
        System.out.println(predio1.calcularImovelNovo());
    }
}
