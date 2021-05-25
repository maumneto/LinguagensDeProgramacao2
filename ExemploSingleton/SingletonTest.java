/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploSingleton;

/**
 *
 * @author mauricio.moreira
 */
public class SingletonTest {
    public static void main(String args[]) {
        Singleton sing = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();
        if (sing == sing2) {
            System.out.println("Objetos iguais!");
        } else {
            System.out.println("Objetos diferentes!");
        }
        sing.methodTest();
    }
}
