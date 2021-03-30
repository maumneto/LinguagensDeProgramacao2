/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula4.Questao4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauricio.moreira
 */
public class Curso {
    public String nomeCurso;
    public int codigo;
    Universidade universidade;
    List<Estudante> estudantes = new ArrayList<Estudante>();
    
    Curso(String nomeCurso, int codigo, Universidade universidade){
        this.nomeCurso = nomeCurso;
        this.codigo = codigo;
        this.universidade = universidade;
    }
    public String getNomeCurso(){
        return this.nomeCurso;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void addAluno(Estudante estudante) {
        this.estudantes.add(estudante);
    }
    public List<Estudante> getEstudantes(){
       return this.estudantes;
    }     
}
