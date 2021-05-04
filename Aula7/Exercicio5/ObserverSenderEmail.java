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
public class ObserverSenderEmail extends Observer {
    private List<String> emails = new ArrayList<String>();

    public ObserverSenderEmail(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    public void addEmail(String email) {
        emails.add(email);
    }
    public void getEmail() {
        for (String email: emails) {
            System.out.println(email);
        }
    }
    @Override
    public void update() {
        System.out.println("A wild event appears!");
        System.out.println("Sending emails to: ");
        getEmail();
    }
}
