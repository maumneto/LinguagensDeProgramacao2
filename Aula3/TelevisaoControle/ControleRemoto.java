/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula3.TelevisaoControle;
//Crie uma classe Televisão e uma classe ControleRemoto
//que pode controlar o volume e trocar os canais da televisão.
//O controle remoto permite as seguintes ações:
//○ Aumentar ou diminuir o volume de som em uma unidade.
//○ Aumentar e diminuir o número do canal em uma unidade.
//○ Trocar para um canal indicado.
//○ Mostrar o volume de som e o canal selecionado atualmente.
/**
 *
 * @author mauricio.moreira
 */
public class ControleRemoto {
    int volume;
    int canal;
    
    ControleRemoto(int volume, int canal){
        this.volume = volume;
        this.canal = canal;
    }
    public int aumentarVolume(){
        return this.volume++;
    }
    public int aumentarCanal(){
        return this.canal++;
    }
    public int diminuirVolume(){
        return this.volume--;
    }
    public int diminuirCanal(){
        return this.canal--;
    }
    public void trocarCanal(int novoCanal) {
        this.canal = novoCanal;
    }
    public void mostrarStatus() {
        System.out.println("Volume: " + this.volume);
        System.out.println("Canal: " + this.canal);
    } 
}
