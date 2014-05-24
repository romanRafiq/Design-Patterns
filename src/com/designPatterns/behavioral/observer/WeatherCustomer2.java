/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.observer;

/**
 *
 * @author Roman
 */
public class WeatherCustomer2 implements WeatherObsserver{

    @Override
    public String doUpdate(int temperature) {
        //Notify customer
        //Send out messages
         return "nofitied on update";
    }
    
}
