/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteCodigo;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author mauricio.moreira
 */
public class TesteQueue {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Random gen = new Random();
        for (int i = 0; i < 10; i++) {
            int value = gen.nextInt(100);
            System.out.println(value);
            fila.add(value);
        }
        System.out.println("Elementos da Fila: " + fila);
        System.out.println("Tamanho da fila: " + fila.size());
        int head = fila.peek();
        System.out.println("Primeiro elemento: " + head);
        int removed = fila.remove();
        System.out.println("Elemento retirado: " + removed);
        
        if (fila.peek() != null) {
            //Integer remove = fila.remove();
            System.out.println("Elemento removido: " + fila.poll());
        }
        System.out.println(fila);
    }
}
