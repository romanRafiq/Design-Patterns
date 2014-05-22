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
    public void describe() {
        animal.describe();
        System.out.println("I have legs");
        walk();
    }
    
    public void walk()
    {
        System.out.println("I can walk");
    }    
    
}
