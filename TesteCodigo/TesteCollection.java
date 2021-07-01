/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteCodigo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author mauricio.moreira
 */
public class TesteCollection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Collection<Integer> valores = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Digite o valor " + i + " : ");
//            int valor = in.nextInt();
//            valores.add(valor);
//        }
//        System.out.println(valores);
//        Iterator iter = valores.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }
        
//        System.out.println("Máximo valor da Collection: " + Collections.max(valores));
//        System.out.println("Mínimo valor da Collection: " + Collections.min(valores));
        
        List<String> colecoes = new ArrayList<>();
        List<String> colecoes2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a String " + i + " : ");
            String word = in.next();
            colecoes.add(word);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a String " + i + " : ");
            String word = in.next();
            colecoes2.add(word);
        }
        
        if (Collections.disjoint(colecoes, colecoes2)) {
            System.out.println("Não há elementos em comum");
        } else {
            System.out.println("Existem elementos em comum");
        }
        System.out.println(colecoes);
        Collections.sort(colecoes);
        System.out.println("Ordenado: " +  colecoes);
        Collections.reverse(colecoes);
        System.out.println(colecoes);
        Collections.shuffle(colecoes);
        System.out.println("Ordenação pelo Shuffle: " + colecoes);
    }
}
