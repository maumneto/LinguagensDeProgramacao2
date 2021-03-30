/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula4.Questao3;

/**
 *
 * @author mauricio.moreira
 */
public class Teste3 {

    public static void main(String[] args) {
        // criando os objetos que representarem os professores Maurício e Fulano de Tal.
        Professor3 profMauricio = new Professor3("Maurício Neto", 1);
        Professor3 profJoao = new Professor3("João de Fulano", 2);
        // criando os objetos que representam as disciplinas de LIP e POO
        Disciplina3 poo = new Disciplina3("Programação Orientado a Objetos", 123);
        Disciplina3 lip = new Disciplina3("Linguagens de Programação I", 321);
        // Adicionando os professores às disciplinas
        poo.addProfessor(profMauricio);
        lip.addProfessor(profJoao);
        lip.addProfessor(profMauricio);
        // Associando as disiciplinas aos professores
        profMauricio.addDisciplina(poo);
        profMauricio.addDisciplina(lip);
        profJoao.addDisciplina(lip);
        // verificando as associações
        System.out.println("Disciplinas Ministradas por " + profMauricio.getNomeProfessor());
        profMauricio.mostrarDisciplinasMinistradas();
        
        System.out.println("-----------------"); 
        System.out.println("Disciplinas Ministradas por " + profJoao.getNomeProfessor());
        profJoao.mostrarDisciplinasMinistradas();
        
        System.out.println("-----------------");
        System.out.println("Professores da disciplina de: " + lip.getNomeDisciplina() + ": ");
        lip.mostrarProfessoresDasDisciplina();
    }
}
