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

//ss implements Meal's three abstract methods and also overrides the eat() method. 
public class TacoMeal extends Meal{

    @Override
    public void prepareIngredients() {
        //perform a function here or diplay something
        //System.out.println("Getting ground beef and shells");
    }

    @Override
    public void cook() {
        //perform a function here or diplay something
        //System.out.println("Cooking ground beef in pan");
    }

    @Override
    public void cleanUp() {
        //perform a function here or diplay something
        //System.out.println("Doing the dishes");
    }
    @Override//Override the eat method from the Meal class
    public String eat() {
         return "Mmm leka";
    }
    
}
