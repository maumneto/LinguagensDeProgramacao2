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
public class Carro {
    // atributos 
    public int qtdPortas;
    public int cilindradas;
    public String marca;
    public String modelo;
    
    // métodos
    public void Acelerar() {
        System.out.println("Acelerando o " + modelo);
    }
    public void Frear() {
        System.out.println("Freando o " + modelo);
    }
    
}
