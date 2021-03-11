// Faça um programa que leia um ângulo em graus e apresente a
// conversão em radianos.
// ○ Nota: a fórmula de conversão é R = G* π/180, sendo que G é o ângulo em graus
// e R em radianos.

package Aula1;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final float PI = 3.1415f; // constante 
        float graus, rad;
        // entrada de dados
        System.out.print("Entre com o valor em graus: ");
        graus = scan.nextFloat();
        // calculo
        rad = (float)(PI * graus)/180;
        //saída de dados
        System.out.println("O valor em radianos é " + rad + " radianos.");
        scan.close();
    }
}
