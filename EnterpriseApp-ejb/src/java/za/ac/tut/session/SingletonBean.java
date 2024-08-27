/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.session;

import jakarta.ejb.Singleton;
import jakarta.ejb.Stateful;

/**
 *
 * @author RoseBaloyi
 */
@Stateful
@Singleton
public class SingletonBean implements SingletonInterface {

    private int counter = 0;
    
    @Override
    public int counter() {
        return counter++;
    }
    
}
