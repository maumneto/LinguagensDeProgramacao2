package Aula0;

import java.util.Scanner;

public class QuestaoB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota1, nota2, media; // variaveis locais
        // entrada de dados
        System.out.print("Digite o valor da primeira nota: ");
        nota1 = scan.nextFloat();
        System.out.print("Digite o valor da segunda nota: ");
        nota2 = scan.nextFloat();
        scan.close();
        // calculo da média e verificação do estado do aluno
        media = (nota1 + nota2)/2;
        System.out.println("O valor da média é: " + media);
        if (media < 5.0){
            System.out.println("O aluno esta reprovado!");
        } else {
            System.out.println("O aluno esta aprovado!");
        } 

    }
}
