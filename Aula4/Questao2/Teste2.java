/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula4.Questao2;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author mauricio.moreira
 */
public class Teste2 {
    public static void main(String[] args) {
        Professor2 profMauricio = new Professor2("Maurício Neto", 1);
        Disciplina2 poo = new Disciplina2("Programacao Orientada a Objetos", 123, profMauricio);
        Disciplina2 lip1 = new Disciplina2("Linguagem de Programacao I", 321, profMauricio);
        
        profMauricio.addDisciplina(lip1);
        profMauricio.addDisciplina(poo);
        
        System.out.println("Nome do Professor: " + profMauricio.getNomeProfessor());
        System.out.println("Total de Disciplinas Ministradas: " + profMauricio.getTotalDisciplinas());
        System.out.println("Disciplinas Ministradas: ");
        profMauricio.getNomeDasDisciplinas();
    }
}
