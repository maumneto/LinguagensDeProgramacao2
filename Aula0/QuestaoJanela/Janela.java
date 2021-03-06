package Aula0.QuestaoJanela;

import java.util.Scanner;

class Janela {
public static void main(String[] args) {
    float altura, largura , perimetro , area; // variaveis
    // instanciando os objetos necessários
    Retangulo ret = new Retangulo ();
    Scanner entrada = new Scanner (System.in);
    // entrada de dados
    System .out.print("Digite a altura: " );
    altura = entrada .nextFloat ();
    System .out.print("Digite a largura: " );
    largura = entrada .nextFloat ();
    entrada .close();
    // envia os dados captados para o objeto retagulo
    ret.setAltura (altura);
    ret.setLargura (largura);
    // capta o retorno dos métodos
    area = ret.calculaArea ();
    perimetro = ret.calculaPerimetro ();
    // saída de dados
    System .out.print("O valor da área é: " + area + "\n");
    System .out.print("O valor do perímetro é: " + perimetro );
    }
}