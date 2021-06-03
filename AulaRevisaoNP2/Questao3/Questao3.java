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
public class Questao3 {
    public static void main(String args[]) {
        ImovelNovo casinha_nova =  new ImovelNovo(100000, 5000);
        System.out.println("Valor da casa: " + casinha_nova.calculoImovelNovo());
        ImovelVelho casinha_velha =  new ImovelVelho(70000, 1000);
        System.out.println("Valor da casa: " + casinha_velha.calculoImovelVelho());
        NovoImovelCorretor casinha_nova_corretor = new NovoImovelCorretor(100000, 5000, 0.04);
        System.out.println("Valor da casa: " + casinha_nova_corretor.calculoImovelNovo());
    }
}
