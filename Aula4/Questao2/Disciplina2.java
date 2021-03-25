/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula4.Questao2;
import java.util.List;
/**
 *
 * @author mauricio.moreira
 */
public class Disciplina2 {
    public String nomeDisc;
    public int codigo;
    Professor2 professor;
    
    Disciplina2(String nomeDisc, int codigo, Professor2 professor){
        this.nomeDisc = nomeDisc;
        this.codigo = codigo;
        this.professor = professor;
    }
    public String getNomeDisciplina() {
        return this.nomeDisc;
    }
    public int getCodigo(){
        return this.codigo;
    }
}
