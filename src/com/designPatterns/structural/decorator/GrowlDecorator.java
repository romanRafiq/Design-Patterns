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
public class GrowlDecorator extends AnimalDecorator {

    //Construtor
    public GrowlDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public String describe() {
        animal.describe();
        return growl();
    }
    
    public String growl()
    {
        return "Grrr";
    }
    
}
