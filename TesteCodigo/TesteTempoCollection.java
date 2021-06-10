/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteCodigo;

import java.util.List;
import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;
/**
 *
 * @author mauricio.moreira
 */
public class TesteTempoCollection {
        public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<Integer>();
        List<Integer> lista2 = new Vector<Integer>();
        List<Integer> lista3 = new LinkedList<Integer>();

        // desempenho do ArrayList
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
          lista1.add(i);
        }
        long end = System.nanoTime();
        long diff = end - start;
        System.out.println("Tempo ArrayList: " + diff);

        // desempenho do vector
        long start2 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
          lista2.add(i);
        }
        long end2 = System.nanoTime();
        long diff2 = end2 - start2;
        System.out.println("Tempo Vector: " + diff2);

        // desempenho do vector
        long start3 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
          lista3.add(i);
        }
        long end3 = System.nanoTime();
        long diff3 = end3 - start3;
        System.out.println("Tempo LinkedList: " + diff3);
    }
}
