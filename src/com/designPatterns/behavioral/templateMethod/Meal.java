/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.templateMethod;

/**
 *
 * @author Roman
 */
public abstract class Meal {
    
    //template method
    public final void doMeal()
    {
        prepareIngredients();
        cook();
        eat();
        cleanUp();
    }
    
    public abstract void prepareIngredients();
    public abstract void cook();
    public abstract void cleanUp();
    
    public void eat()//This method will be implemented throughout the classes
    {
        System.out.println("Mmm, thats leka");
    }
    
}
