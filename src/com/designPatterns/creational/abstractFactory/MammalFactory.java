/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.creational.abstractFactory;

/**
 *
 * @author Roman
 */
public class MammalFactory implements SpeciesFactory{

    @Override
    public Animal getAnimal(String type) {
        if(type.equals("dog"))            
        {
            return new Dog();
        }
        else
        {
            return new Cat();
        }        
    }
    
}
