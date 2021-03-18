/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula2.QuestaoCarro;

/**
 *
 * @author mauricio.moreira
 */
public class Principal {
    public static void main(String[] args) {
        Carro carroJoao = new Carro();
        carroJoao.qtdPortas = 4;
        carroJoao.cilindradas = 2000;
        carroJoao.modelo = "Nivus";
        carroJoao.marca = "Volkwagem";
        carroJoao.Acelerar();
        carroJoao.Frear();
        
        Carro carroMaria = new Carro();
        carroMaria.cilindradas = 2500;
        carroMaria.qtdPortas = 4;
        carroMaria.marca = "Chevrolet";
        carroMaria.modelo = "S10";
        carroMaria.modelo = "Onix";
        carroMaria.Acelerar();
        carroMaria.Frear();
    }
}
