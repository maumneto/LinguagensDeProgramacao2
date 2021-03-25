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
public class Disciplina {
    public String nome;
    public int codigo;
    public Professor professor;
    Disciplina(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    public String getNomeDisciplina() {
        return this.nome;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    public String getNomeProfessor() {
        return this.professor.nome;
    }
}
