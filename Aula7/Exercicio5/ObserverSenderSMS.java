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
public class ObserverSenderSMS extends Observer{
        private List<String> phoneNumbers = new ArrayList<String>();

    public ObserverSenderSMS(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    public void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }
    public void getNumbers() {
        for (String number: phoneNumbers) {
            System.out.println(number);
        }
    }
    @Override
    public void update() {
        System.out.println("A wild event appears!");
        System.out.println("Sending SMS to: ");
        getNumbers();
    }
}
