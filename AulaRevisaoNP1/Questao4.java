/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaRevisaoNP1;

/**
 *
 * @author mauricio.moreira
 */
class Professor {
    public String nome;
    public int id;
    Disciplina disciplina;
    
   Professor(String nome, int id, Disciplina disciplina) {
       this.nome = nome;
       this.id = id;
       this.disciplina = disciplina;
   }
}

class Disciplina {
    public String nome;
    public int codigo;
    Professor professor;
    
    public Disciplina(String nome, int codigo) {
        this.codigo = codigo;
        this.nome = nome;
    }
    public String getNomeDisciplina() {
        return nome;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public String getNomeProfessor() {
        return professor.nome;
    }
}

public class Questao4 {
    public static void main(String[] args) {
        Disciplina poo = new Disciplina("Programação Orientada a Objetos", 100);
        Professor mauricio = new Professor("Mauricio", 1, poo);
        poo.setProfessor(mauricio);
        
        System.out.println("Nome da disciplina: " + poo.getNomeDisciplina());
        System.out.println("Nome do professor responsável: " + poo.getNomeProfessor());
    }
}
