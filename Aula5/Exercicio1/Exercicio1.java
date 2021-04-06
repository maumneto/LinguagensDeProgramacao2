/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5.Exercicio1;
//Crie uma classe geral (superclasse) que contenha um
//atributo privado, um atributo público e um atributo
//protegido. Crie uma classe especializada (subclasse) que
//herde da geral. Na classe especializada (subclasse) crie um
//método público que use o atributo privado e o atributo
//protegido da superclasse. Crie uma terceira classe que
//contenha o método principal (main) e instancie, no método
//main, um objeto da classe geral e um objeto da classe
//especializada. Tente invocar, por meio de cada objeto
//instanciado todos os atributos e métodos da superclasse e da
//subclasse. Justifique o motivo de algumas operações não
//terem sido efetuadas com sucesso.
class SuperClasse {
    private int a;
    public int b;
    protected int c;

    public SuperClasse(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void setA(int a) {
       this.a = a;
    }
    public int getA() {
       return a;
    }
}

class SubClasse extends SuperClasse {
    public SubClasse(int a, int b, int c) {
        super(a,b,c);
    }
    
    public void metodo() {
        System.out.println(getA());
        System.out.println(c);  
    }
}
/**
 *
 * @author mauricio.moreira
 */
public class Exercicio1 {
    public static void main(String[] args) {
        SuperClasse spc = new SuperClasse(1, 2, 3);
        SubClasse sc = new SubClasse(4, 5, 6);
        
        // Superclasse
        //System.out.println(spc.a);
        System.out.println(spc.b);
        System.out.println(spc.c);
        System.out.println(spc.getA());
        
        System.out.println("---------");
        //Subclasse
        System.out.println(sc.b);
        System.out.println(sc.c);
        sc.metodo();
    }
}
