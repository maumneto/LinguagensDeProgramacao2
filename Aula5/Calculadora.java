/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5;

/**
 *
 * @author mauricio.moreira
 */
public class Calculadora {
    public int somar(int a, int b){
        return a + b;
    }
    public float somar(float a, float b){
        return a + b;
    }
    public double somar(double a, double b) {
        return a + b;
    }
    public int somar(int... valores) {
        int total = 0;
        for (int v: valores) {
            total += v;
        }
        return total;
    }
    
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(4.939084938, 4.343424));
        System.out.println(calc.somar(1,2,3,4,5,6,7,8,9));
    }
}
