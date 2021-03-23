/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula3;
//Crie uma classe para representar uma pessoa, com os
//atributos públicos de nome, ano de nascimento e altura.

import java.util.Calendar;

//Esta classe deve possuir os seguintes métodos
//Crie um método para imprimir todos os dados de uma pessoa.
//Crie um método para calcular a idade da pessoa.
/**
 *
 * @author mauricio.moreira
 */
public class Pessoa {
    String nome;
    int anoNascimento;
    float altura;
    
    Pessoa(String nome, int anoNascimento, float altura){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }
    String getNome(){
        return this.nome;
    }
    public void mostrarDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano de Nascimento: " + this.anoNascimento);
        System.out.println("Altura: " + this.altura);
    }
    public int CalcularIdade() {
        int anoAtual, idade = 0;
        Calendar calendar = Calendar.getInstance();
        anoAtual = calendar.get(Calendar.YEAR);
        idade = anoAtual - this.anoNascimento;
        return idade;
    }
}

class Teste {
    public static void main(String[] args) {
        String nome = "Maurício Moreira";
        int ano = 1990;
        float altura = 1.65f;
        Pessoa pessoaMauricio = new Pessoa(nome, ano, altura);
        pessoaMauricio.mostrarDados();
        System.out.println("A idade do " + pessoaMauricio.getNome() + " é " + pessoaMauricio.CalcularIdade()); 
    }
}