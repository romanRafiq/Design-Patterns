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
//an Observer
//WeatherCustomer1 is an observer that implements WeatherObserver
public class WeatherCustomer1 implements WeatherObsserver{

    //variable to perform a test
    int temperature =0;
    
    
    @Override
    public void doUpdate(int temperature) {
        //Notify customer
        //Send out messages
        this.temperature = temperature;
    }
     //I used it for testing purposes
    public int getTemperature()
    {
        return temperature;
    }
    
}
