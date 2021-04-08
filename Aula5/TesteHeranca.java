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
class ClasseA {
    public void metodoA(){
        System.out.println("Invocando o metodoA da Classe A");
    }
    public void metodoB(){
        System.out.println("Invocando o metodoB da Classe A");
    }
}

class ClasseB extends ClasseA {
    public void metodoB(){
        System.out.println("Invocando o metodoB da Classe B");
    }
    public void metodoC(){
        System.out.println("Invocando o metodoC da Classe B");
    }
}

class TesteHeranca {
    public static void main(String[] args){
        ClasseB b = new ClasseB();
        ClasseA a = new ClasseA();
        b.metodoA();
        //b.metodoB();
        //((ClasseA)b).metodoB();
        b.metodoC();
    }
}
