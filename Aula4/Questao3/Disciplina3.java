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
import java.util.List;
import java.util.ArrayList;

public class Disciplina3 {

    public String nome;
    public int codigo;
    List<Professor3> professores = new ArrayList<Professor3>();

    Disciplina3(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    public String getNomeDisciplina() {
        return this.nome;
    }
    public int getCodigo() {
        return this.codigo;
    }
    public void addProfessor(Professor3 professor) {
        this.professores.add(professor);
    }
    public void mostrarProfessoresDasDisciplina() {
        for (Professor3 p : professores) {
            System.out.println(p.getNomeProfessor());
        }
    }
}
