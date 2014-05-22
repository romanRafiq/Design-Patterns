/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.structural.decorator;

/**
 *
 * @author Roman
 */
public class LegDecorator extends AnimalDecorator{

    //Constructor
    public LegDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public String describe() {
        animal.describe();        
        return walk();
    }
    
    public String walk()
    {
       return "I can walk";
    }    
    
}
