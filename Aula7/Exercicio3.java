/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula7;
import java.util.Random;
/**
 *
 * @author mauricio.moreira
 */
abstract class Animal {
    abstract String emitirSom();
    abstract void mover();
    abstract void descansar();
}

class Cachorro extends Animal {
    @Override
    String emitirSom() {
        return "Latindo";
    }
    @Override
    void mover() {
        System.out.println("Cachorro se movendo...");
    }
    @Override
    void descansar() {
        System.out.println("Cachorro descansando...");
    }
}

class Gato extends Animal {
    @Override
    String emitirSom() {
        return "Miando";
    }
    @Override
    void mover() {
        System.out.println("Gato se movendo...");
    }
    @Override
    void descansar() {
        System.out.println("Gato descansando...");
    }
}

class Adestrador {
    Animal adestrarAnimal() {
        Gato cat = new Gato();
        Cachorro dog = new Cachorro();
        Random randomize = new Random();
        Animal animais[] = {cat, dog};
        return animais[randomize.nextInt(animais.length)];
    }
    void brincar(Animal animal) {
        System.out.println(animal.emitirSom());
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        Adestrador adestrador = new Adestrador();
        for (int i = 0; i < 10; i++) {
            Animal animal = adestrador.adestrarAnimal();
            adestrador.brincar(animal);
        }
    }
}
