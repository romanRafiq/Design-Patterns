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
    public final String doMeal()
    {
        prepareIngredients();
        cook();
        eat();
        cleanUp();
        
        return "had meal";
    }
    
    public abstract void prepareIngredients();
    public abstract void cook();
    public abstract void cleanUp();
    
    public String eat()//This method will be implemented throughout the classes
    {
        return "eating";
    }
    
}
