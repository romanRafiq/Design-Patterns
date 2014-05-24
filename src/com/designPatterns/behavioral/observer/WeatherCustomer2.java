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
    public void doUpdate(int temperature) {
        //Notify customer
        //Send out messages
        System.out.println("Weather customer 2 just found out the temperature is:" + temperature);
    }
    
}
