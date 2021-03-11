// Faça um programa que pergunte quanto você ganha por hora e o
// número de horas trabalhadas por mês. Calcule e mostre o total do seu
// salário no referido mês, sabendo que são descontados 11% para o
// Imposto de Renda, 8% para o INSS e 5% para o sindicato. Seu
// programa deve seguir o modelo de saída abaixo:
// ○ + Salário Bruto: R$
// ○ - IR (11%): R$
// ○ - INSS (8%): R$
// ○ - Sindicato (5%): R$
// ○ = Salário Líquido: R$
// ○ Obs.: Salário Bruto - Descontos = Salário Líquido

package Aula1;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float salarioBruto, salarioLiquido, valorHora, ir, inss, sind;
        int horas;
        // entrada de dados
        System.out.print("Digite as horas trabalhadas no mês: ");
        horas = scan.nextInt();
        System.out.print("Digite o valor da hora: ");
        valorHora = scan.nextFloat();
        scan.close();
        // calculo dos valores e deduções
        salarioBruto = horas * valorHora;
        System.out.println("+ Salário Bruto: R$ " + salarioBruto);
        ir = salarioBruto*0.11f;
        System.out.println("- IR (11%): R$ " + ir);
        inss = salarioBruto*0.08f;
        System.out.println("- INSS (8%): R$ " + inss);
        sind = salarioBruto*0.05f;
        System.out.println("- Sindicato (5%): R$ " + sind);
        salarioLiquido = salarioBruto - ir - inss - sind;
        System.out.println("= Salário Líquido: R$ " + salarioLiquido);
    }
}
