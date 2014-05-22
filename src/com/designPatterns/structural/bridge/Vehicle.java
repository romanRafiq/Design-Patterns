/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.structural.bridge;

/**
 *
 * @author Roman
 */
public abstract class Vehicle {
    
    Engine engine;   
    int weightInKgs;
    private int ratio;
    
    
    public abstract void drive();
    
    public void setEngine(Engine engine)
    {
        this.engine = engine;        
    }
    
    public void reportOnSpeed(int horsepower) {
         ratio = weightInKgs / horsepower;

       /* ***Ratio****
         ratio < 3 = It's going fast;
         ratio >= 3 && ratio < 8 = average speed
         else  = It's moving like a turtle!");
        */
        
    }
    public int getRatio()
    {
        return ratio;
    }
    
}
