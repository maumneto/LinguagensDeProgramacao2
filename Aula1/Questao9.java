/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1;
//Faça um algoritmo que leia um vetor de 10 posições. Conte
//e mostre quantos valores pares ele possui.
import java.util.Scanner;

/**
 * @author mauricio.moreira
 */
public class Questao9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vetor = new int[10];
        int contPar = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor do indice " + i + " : ");
            vetor[i] = scan.nextInt();
            if (vetor[i] % 2 == 0) {
                System.out.println("Elemento par: " + vetor[i]);
                contPar++;
            }
        }
        System.out.println("Total de pares: " + contPar);
    }
}
