/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula7;

/**
 *
 * @author mauricio.moreira
 */

interface Calculadora {
    public double somar (double x, double y);
    public double subtrair (double x, double y);
    public double dividir (double x, double y);
    public double multiplicar (double x, double y);
}

interface CalculadoraCientefica {
    public double sqrt(double x);
}

class CalculadoraImplements implements Calculadora, CalculadoraCientefica {
    @Override
    public double somar(double x, double y) {
        return x + y;
    }
    @Override
    public double subtrair (double x, double y) {
        return x - y;
    }
    @Override
    public double multiplicar (double x, double y){
        return x * y;
    }
    @Override
    public double dividir (double x, double y) {
        double res = -1;
        if (y == 0) {
            System.out.println("Error");
        } else {
            res =  x/y;
        }
        return res;
    }
    @Override
    public double sqrt(double x) {
        double res = Math.sqrt(x);
        return res;
    }
}

public class Exercicio2 {
   public static void main(String[] args) {
       CalculadoraImplements calc = new CalculadoraImplements();
       System.out.println(calc.somar(5, 5));
   }
}
