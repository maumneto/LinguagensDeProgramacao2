// Faça um programa que entre com o valor de duas notas, calcule a
// média aritmética e verifique a situação do aluno:
// a. Aprovado (média ≥ 7.0)
// b. Reprovado (média > 4.0)
// c. Final (4.0 ≤ média < 7.0).
// d. Caso o aluno esteja na final, o programa deve receber a nota da
// prova final do aluno e verificar pela nova média se o aluno foi
// aprovado ou não na disciplina:
// i. Aprovado na Final (média ≥ 5.0)
// ii. Reprovado na Final (média < 5.0).

package Aula1;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota1, nota2, media;
        // entrada de dados
        System.out.print("Digite o valor da primeira nota: ");
        nota1 = scan.nextFloat();
        System.out.print("Digite o valor da segunda nota: ");
        nota2 = scan.nextFloat();
        // calculo da média
        media = (nota1 + nota2)/2;
        System.out.println("Sua média foi: " + media);

        // logica da situação
        if (media >= 7.0) {
            System.out.println("Aprovado! Pode ir!!");
        } else {
            if (media < 4.0) {
                System.out.println("Reprovado! Fica ai mesmo!");
            } else {
                System.out.println("Final! Vamos para a prova final!");
                float notaFinal, mediaFinal;
                System.out.print("Digite a nota da final: ");
                notaFinal = scan.nextFloat();
                mediaFinal = (notaFinal + media)/2;
                System.out.println("Sua média final é " + mediaFinal);
                if (mediaFinal >= 5.0) {
                    System.out.println("Aprovado! Passou raspando!");
                } else {
                    System.out.println("Reprovado!");
                }
            }
        }
        scan.close();
    }
}
