/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula4.Questao4;

/**
 *
 * @author mauricio.moreira
 */
public class Estudante {
    public String nome;
    public String matricula;
    Curso curso;
    // construtor
    Estudante(String nome, String matricula, Curso curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
}
