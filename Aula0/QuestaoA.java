package Aula0;

import java.util.Scanner;

public class QuestaoA {
    public static void main(String[] args) {
        // instanciando o objeto scanner com o parâmetro 'System.in'
        Scanner scan = new Scanner(System.in);
        // criando as variaveis da questao
        float fahrenheit, celsius;
        // entrada de dados
        System.out.print("Digite o valor em graus: ");
        celsius = scan.nextFloat();
        scan.close();
        // calculo da conversão
        fahrenheit = (float)(celsius * 1.8 + 32);
        // saída de dados
        System.out.println("O valor em Fahrenheit é: " + fahrenheit);
    }
}