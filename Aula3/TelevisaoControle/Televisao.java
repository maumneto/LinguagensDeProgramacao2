/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula3.TelevisaoControle;

/**
 *
 * @author mauricio.moreira
 */
public class Televisao {
    public int canal;
    public int volume;
    
    public Televisao() {
        this.canal = 0;
        this.volume = 0;
        System.out.println("Construtor da Televisao!");
    }
    
    public static void main(String args[]) {
        Televisao tv = new Televisao();
        ControleRemoto controle = new ControleRemoto(tv.volume, tv.canal);
        
        controle.mostrarStatus();
        for (int i = 0; i < 10; i++) {
            controle.aumentarCanal();
            controle.aumentarVolume();
        }
        controle.mostrarStatus();
       
        controle.trocarCanal(444);
        controle.mostrarStatus();
        
    } 
}
