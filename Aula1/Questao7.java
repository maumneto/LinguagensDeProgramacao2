/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1;

//Faça um programa que calcule a diferença entre a soma dos
//quadrados dos primeiros 10 números naturais e o quadrado da soma.
//Exemplo: a soma dos quadrados dos dez primeiros números naturais
//é: 12 + 22 + ... + 102 = 385 O quadrado da soma dos dez primeiros
//números naturais é: (1 + 2 + ... + 10)2 = 3025 A diferença entre a
//soma dos quadrados dos dez primeiros números naturais e o
//quadrado da soma é: 3025 – 385 = 2640.

/**
 *
 * @author mauricio.moreira
 */
public class Questao7 {
    public static void main(String[] args) {
        int somaQuad = 0, quadSoma = 0, dif = 0, cont = 1;
        while(cont <= 10) {
            somaQuad = somaQuad + (cont*cont);
            quadSoma = quadSoma + cont;
            cont++;
        }
        quadSoma = quadSoma * quadSoma;
        dif = quadSoma - somaQuad;
        System.out.print("A diferença é = " + dif);
    }
}
