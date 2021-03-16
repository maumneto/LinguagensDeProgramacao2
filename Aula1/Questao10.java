/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1;
//Faça um programa que leia uma matriz de 3 x 3 elementos.
//Calcule a soma dos elementos que estão na diagonal
//principal.
import java.util.Scanner;
/**
 *
 * @author mauricio.moreira
 */
public class Questao10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int [][] matriz = new int[3][3];
        int soma = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Digite o valor de indice " + i + " " + j + " : ");
                matriz[i][j] = scan.nextInt();
                if (i == j) {
                    soma = soma + matriz[i][j];
                }
            }
        }
        System.out.print("O somatorio dos valores da diagonal principal é: " + soma);
    }
}
