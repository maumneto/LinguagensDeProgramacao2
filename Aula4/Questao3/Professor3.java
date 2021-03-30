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
import java.util.ArrayList ;
import java.util.List;

public class Professor3 {
    // atributos da classe
    public String nome;
    public int id;
    List<Disciplina3> disciplinas = new ArrayList<Disciplina3>();
    // construtor
    Professor3(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    public String getNomeProfessor() {
        return this.nome;
    }
    public int getId() {
        return this.id;
    }
    public void addDisciplina(Disciplina3 disciplina) {
        this.disciplinas.add(disciplina);
    }
    public void mostrarDisciplinasMinistradas() {
        for (Disciplina3 d : disciplinas) {
            System.out.println(d.getNomeDisciplina());
        }
    }
}
