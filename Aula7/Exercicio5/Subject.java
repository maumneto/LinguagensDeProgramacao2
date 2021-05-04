/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula7.Exercicio5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauricio.moreira
 */
public class Subject {
    public List<Observer> observers = new ArrayList<Observer>();
    
    public boolean isEven(int number) {
        boolean flag = true;
        if (number % 2 != 0) {
            flag = false;
        }
        return flag;
    }
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    public void notifyAllAttaches() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
