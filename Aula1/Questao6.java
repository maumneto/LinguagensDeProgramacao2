/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Faça um programa que peça para o usuário digitar 10 valores e
//calcule a média aritmética dos valores digitados.

package Aula1;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class Questao6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float val, media = 0, cont = 0;
        while(cont < 5) {
            System.out.print("Digite o valor: ");
            val = scan.nextFloat();
            media = media + val;
            cont++;
        }
        media = media/cont;
        System.out.print("Media = " + media);
        scan.close();
    }
}
