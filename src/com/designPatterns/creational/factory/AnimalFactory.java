/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.creational.factory;

/**
 *
 * @author Roman
 */
public class AnimalFactory {
    
    public Animal getAnimal(String type)
    {
        //Compare type and Return class
        if(type.equals("dog"))
        {
            return new Dog();// only works if you dog calls implements
        }
        else
        {
            return new Cat();
        }        
        
    }
}
