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
public class BigBus extends Vehicle{

    //Constructor
   public BigBus(Engine engine) {
        this.weightInKgs = 3000;
        this.engine = engine;
    }
    @Override
    public void drive() {
        
        System.out.println("\nThe big bus is rollin'");
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
    }
    
}
