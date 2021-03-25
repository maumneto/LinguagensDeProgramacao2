/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula4.Questao1;

/**
 *
 * @author mauricio.moreira
 */
public class Teste {
    public static void main(String[] args) {
        Disciplina poo = new Disciplina("Programação Orientada a Objetos", 123);
        Professor mauricio = new Professor("Mauricio Neto", 1, poo);
        poo.setProfessor(mauricio);
        System.out.println("Nome da disciplina: " + poo.getNomeDisciplina());
        System.out.println("Nome do professor da disciplina: " + poo.getNomeProfessor()); 
    }
}
