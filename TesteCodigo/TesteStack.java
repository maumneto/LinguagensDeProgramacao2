/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteCodigo;

import java.util.Random;
import java.util.Stack;

/**
 *
 * @author mauricio.moreira
 */
public class TesteStack {
    public static void main(String[] args) {
        Stack pilha = new Stack();
        Random gen = new Random();
        for (int i = 0; i < 10; i++) {
            int value = gen.nextInt(50);
            System.out.println(value);
            pilha.push(value);
        }
        System.out.println("Elementos da Pilha: " + pilha);
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Retirando o último inserido: " + pilha.pop());
        
        while(!pilha.isEmpty()){
            System.out.println("Elemento retirado: " + pilha.pop());
        }
        //pilha.clear();
    }
}
