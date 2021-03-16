/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1;

import java.util.Scanner;

//Na matemática, o número harmônico designado por H(n)
//define-se como sendo a soma da série harmônica:
//a. H(n) = 1 + 1/2 + 1/3 + .... 1/n
//Faça um programa que leia um valor de n inteiro e positivo e
//apresente o valor de H(n).
/**
 *
 * @author mauricio.moreira
 */
public class Questao8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float serieHarm = 0;
        int qtd;
        System.out.print("Digite a quantidade: ");
        qtd = scan.nextInt();
        for (int i = 1; i <= qtd; i++) {
            serieHarm = serieHarm + 1/(float)i;
        }
        System.out.print("Resultado Série Harmônica: " + serieHarm);
    }
}
