/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.strategy;

/**
 *
 * @author Roman
 */
public class Context {
    
    //variables
    int temperatureInF;
    
    //Reference object
    Strategy strategy;
    
    //constructor
    public Context(int temperatureInF,Strategy strategy)
    {
        this.temperatureInF = temperatureInF;
        this.strategy = strategy;
    }
    
    //Get temperature
    public int getTemeperature()
    {
        return temperatureInF;
    }
    //Set strategy
    public void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }
    
    //GetResult    
    public boolean getResult()
    {
        return strategy.checkTemperature(temperatureInF);
    }
}
