/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploTemplateMethod;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class Computador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Compilador compilador = null;
        
        System.out.println("Qual compilador deseja utilizar? [android/ios] ");
        String op = scan.next();
        
        if (op.equals("android")) {
            compilador = new AndroidCompilador();
            compilador.MetodoTemplate();
        } else if (op.equals("ios")){
            compilador = new IOSCompilador();
            compilador.MetodoTemplate();
        } else {
            System.out.println("Nenhum opção selecionada!");
        }
        scan.close();
    }
}
