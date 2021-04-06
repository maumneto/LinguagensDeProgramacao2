/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5.Exercicio1;

/**
 *
 * @author mauricio.moreira
 */
class ClasseA {
    private int atributoA = 0;
    protected int metodoA() {
        atributoA = atributoA + 1;
        System.out.println("Método " + atributoA);
        return atributoA;
    }
}
class ClasseB extends ClasseA {
    public void metodoB() {
        int atributoA = metodoA();
        System.out.println("Método " + (atributoA + 1));
    }
}
class Exercicio2 {
    public static void main(String[] args) {
        ClasseB b = new ClasseB();
        b.metodoB();
    }
}

