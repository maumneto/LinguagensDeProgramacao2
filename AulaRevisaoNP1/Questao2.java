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
import java.util.Calendar;

class Pessoa {
    public String nome;
    public int idade;
    public float altura;
    
    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    public void mostrarDados() {
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("altura: " + altura);
    }
    public int calcularAnoNascimento() {
        int anoCorrente, anoNasc;
        Calendar calendar = Calendar.getInstance();
        anoCorrente = calendar.get(Calendar.YEAR);
        anoNasc = anoCorrente - idade;
        return anoNasc;
    }
}

public class Questao2 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("mauricio", 31, 1.61f);
        System.out.println("Ano de nascimento: " + p.calcularAnoNascimento());
    }
}
