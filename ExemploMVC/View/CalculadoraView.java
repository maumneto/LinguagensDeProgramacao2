/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploMVC.View;

import java.util.Scanner;

import ExemploMVC.Controller.CalculadoraController;
/**
 *
 * @author mauricio.moreira
 */
public class CalculadoraView {
    private double n1;
    private double n2;
    private int operacao;
    private Scanner in;
    public CalculadoraView() {
        in = new Scanner(System.in);
    }

    public void entrada() {
        System.out.print("Digite o valor de n1: ");
        double n1 = in.nextDouble();
        this.n1 = n1;
        System.out.print("Digite o valor de n2: ");
        double n2 = in.nextDouble();
        this.n2 = n2;
        System.out.print("Digite a operacao ( 1 - Somar | 2 - Subtrair | 3 - Multiplicar | 4 - Dividir ): ");
        int operacao = in.nextInt();
        this.operacao = operacao;

        CalculadoraController controller = new CalculadoraController(this);
        controller.calcular();
    }

    public void saida(double resultado) {
        System.out.println("Resultado: " + resultado);
        System.out.print("Deseja continuar? ( 1 - Sim | 2 - Nao ): ");
        int resposta = in.nextInt();
        if (resposta == 1) {
            entrada();
        } else {
            encerrar();
        }
    }

    public void encerrar() {
        in.close();
    }

    public int getOperacao() {
        return operacao;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public static void main(String[] args) {
        CalculadoraView view = new CalculadoraView();
        view.entrada();
    }
}
