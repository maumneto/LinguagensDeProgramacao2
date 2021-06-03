/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaRevisaoNP2.Questao1;

import java.util.Random;

/**
 *
 * @author mauricio.moreira
 */
public class Adestrador {
    Animal adestrarAnimal() {
        Gato cat = new Gato();
        Cachorro dog = new Cachorro();
        Random random = new Random();
        Animal animals[] = {cat, dog};
        return animals[random.nextInt(animals.length)];
    }
    void brincar(Animal animal) {
        System.out.println(animal.emitirSom());
    }
}
