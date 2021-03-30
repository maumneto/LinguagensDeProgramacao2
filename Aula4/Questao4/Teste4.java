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
public class Teste4 {
    public static void main(String[] args){
        // criando o objeto da universidade
        Universidade unichristus = new Universidade("UNICHRISTUS", "Centro Universitário Christus");
        // criando os objetos que representam os cursos
        Curso sistemasInfo = new Curso("Sistemas de Informação", 100, unichristus);
        Curso direito = new Curso("Direito", 101, unichristus);
        // criando os objetos que representam os alunos
        Estudante a1 = new Estudante("Fulano", "202110", sistemasInfo);
        Estudante a2 = new Estudante("Sicrano", "202111", direito);
        Estudante a3 = new Estudante("Beltrano", "202112", sistemasInfo);
        Estudante a4 = new Estudante("Alano", "202113", direito);
        // adicionando os alunos aos cursos criados
        sistemasInfo.addAluno(a1);
        sistemasInfo.addAluno(a3);
        direito.addAluno(a2);
        direito.addAluno(a4);
        // criando uma lista de cursos, adicionando os cursos a lista e passando ao objeto unichristus
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(sistemasInfo);
        cursos.add(direito);
        unichristus.setCursos(cursos);
        // teste final
        System.out.println("Universidade: " + unichristus.nomeUniversidade());
        System.out.println("Quantidade de alunos no total: " + unichristus.getTotalAlunosUniversidade());
        System.out.println("Quantidade de cursos: " + unichristus.getTotalCursos());
        System.out.println("Nomes dos cursos oferecidos: ");
        unichristus.getNomeDosCursos();
    }
}
