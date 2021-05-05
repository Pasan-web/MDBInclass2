/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.javainstitute.com;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author Rajitha Yasasri
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "clientId", propertyValue = "0")
    ,
        @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "inclassTopic")
    ,
        @ActivationConfigProperty(propertyName = "subscriptionDurability", propertyValue = "Durable")
    ,
        @ActivationConfigProperty(propertyName = "subscriptionName", propertyValue = "inclassTopic")
    ,
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")
})
public class MDB1 implements MessageListener {

    public MDB1() {
    }

    @Override
    public void onMessage(Message message) {

        try {

            TextMessage tm = (TextMessage) message;
            System.out.println("MDB: " + tm.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
