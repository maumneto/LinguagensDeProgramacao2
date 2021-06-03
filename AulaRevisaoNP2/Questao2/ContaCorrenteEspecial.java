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
public class ContaCorrenteEspecial extends ContaCorrenteSimples {
    public ContaCorrenteEspecial() {
        super();
    }
    public ContaCorrenteEspecial(double montante) {
        super(montante);
    }
    @Override
    public void sacar(double quantia) {
        double taxa = 0.01*quantia;
        if (quantia + taxa > montante) {
            System.out.println("Não possui dinheiro o suficiente.");
        } else{
            montante = montante - quantia - taxa;
        }
    }
}
