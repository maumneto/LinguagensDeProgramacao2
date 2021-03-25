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
public class Professor2 {
    public String nome;
    public int id;
    public List<Disciplina2> disciplinas = new ArrayList<Disciplina2>();
    
    Professor2(String nome, int id){
        this.nome = nome;
        this.id = id;
    }
    public String getNomeProfessor(){
        return this.nome;
    }
    public int getId(){
        return this.id;
    }
    public void addDisciplina(Disciplina2 disciplina) {
        this.disciplinas.add(disciplina);
    }
    public int getTotalDisciplinas(){
        int totalDisciplinas = 0;
        for (Disciplina2 d: disciplinas) {
            totalDisciplinas++;
        }
        return totalDisciplinas;
    }
    public void  getNomeDisciplinas() {
        for (Disciplina2 d: disciplinas) {
            System.out.println(d.nomeDisc);
        }
    }
}
