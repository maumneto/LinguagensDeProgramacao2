package Aula0;

import java.util.Scanner;

public class CalculoAreaPerimetro {
    public static void main(String[] args) {
        // variaveis locais
        float altura, largura, perimetro, area;
        Scanner scan = new Scanner(System.in);
        // entrada de dados
        System.out.print("Digite a altura: ");
        altura = scan.nextFloat();
        System.out.print("Digite a largura: ");
        largura = scan.nextFloat();
        scan.close();
        // calculo da área e do perímetro
        area = altura * largura;
        perimetro = (2 * altura) + (2 * largura);
        // saída de dados
        System.out.print("O valor da área é: " + area + "\n");
        System.out.print("O valor do perímetro é: " + perimetro);
    }
}
