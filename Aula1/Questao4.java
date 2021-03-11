// Faça um programa que receba 3 valores digitados A, B e C,
// informando se estes podem ser os lados de um triângulo. O ABC é
// triângulo se A < B + C e B < A + C e C < A + B.

package Aula1;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a_side, b_side, c_side;
        // entrada de dados
        System.out.println("Digite o valor do lado A: ");
        a_side = scan.nextInt();
        System.out.println("Digite o valor do lado B: ");
        b_side = scan.nextInt();
        System.out.println("Digite o valor do lado C: ");
        c_side = scan.nextInt();
        scan.close();
        // logica (forma 1)
        if ((a_side < b_side + c_side) && (b_side < a_side + c_side) && (c_side < b_side + a_side)) {
            System.out.println("É um triângulo");
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}
