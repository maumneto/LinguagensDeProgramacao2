// Faça um programa que receba a altura e o sexo de uma
// pessoa. Calcule e mostre seu peso ideal utilizando as
// seguintes fórmulas:
// a. Homens: (72.7 * altura) - 58
// b. Mulheres: (62.1 * altura) - 44.7

package Aula1;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float altura, peso;
        String sexo;
        // entrada de dados
        System.out.println("Qual o seu sexo (M-mulher ou H-homem): ");
        sexo = scan.next();
        System.out.println("Qual o valor de sua altura: ");
        altura = scan.nextFloat();
        sexo = sexo.toUpperCase();
        scan.close();
        // logica
        switch(sexo) {
            case "H":
                peso = (float)((72.7 * altura) - 58);
                System.out.println("O seu peso ideal seria: " + peso);
                break;
            case "M":
                peso = (float)((62.1 * altura) - 44.7);
                System.out.println("O seu peso ideal seria: " + peso);
                break;
            default:
                System.out.println("Entrada incorreta!");
        }
    }
}
