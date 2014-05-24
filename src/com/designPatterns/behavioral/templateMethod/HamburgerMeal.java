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

//extend Meal and implements Meal's three abstract methods. 
public class HamburgerMeal extends Meal{

    @Override
    public void prepareIngredients() {
        //perform a function here or diplay something
        //System.out.println("Getting burgers, buns, and french fries");
    }

    @Override
    public void cook() {
        //perform a function here or diplay something
       //System.out.println("Cooking burgers on grill and fries in oven");
    }

    @Override
    public void cleanUp() {
        //perform a function here or diplay something
        //System.out.println("Throwing away paper plates");

    }
    
}
