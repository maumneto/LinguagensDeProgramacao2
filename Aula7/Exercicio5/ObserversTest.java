/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula7.Exercicio5;

/**
 *
 * @author mauricio.moreira
 */
public class ObserversTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        
        ObserverSenderEmail sender_email = new ObserverSenderEmail(subject);
        ObserverSenderSMS sender_sms = new ObserverSenderSMS(subject);
        sender_email.addEmail("mauricio@provedor.com");
        sender_email.addEmail("fulano@provedor.com");
        sender_sms.addPhoneNumber("85 999887766");
        sender_sms.addPhoneNumber("85 911223344");
        
        for (int i = 0; i < 5; i++) {
            if (subject.isEven(i) == true) {
                subject.notifyAllAttaches();
                System.out.println("----");
            }
        }
    }
}
