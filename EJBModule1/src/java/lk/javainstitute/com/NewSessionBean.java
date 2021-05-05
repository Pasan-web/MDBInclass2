/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.javainstitute.com;

import javax.ejb.Stateless;

/**
 *
 * @author Rajitha Yasasri
 */
@Stateless
public class NewSessionBean implements NewSessionBeanRemote, NewSessionBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public void readMessage(){
    
        System.out.println("read");
    }
}
