/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1;
//Faça um programa que leia um valor digitado e calcule o
//fatorial deste número.
import java.util.Scanner;
/**
 *
 * @author mauricio.moreira
 */
public class Questao11 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int fat = 1, val;
        System.out.print("Digite um valor: ");
        val = scan.nextInt();
        if (val < 0){
            System.out.println("Não existe fatorial de negativos");
        } else if (val == 0) {
            System.out.println("1");
        } else {
            for (int i = 1; i <= val; i++){
                fat = fat*i;
            }
            System.out.println("Valor do fatorial: " + fat);
        }
    }
}
