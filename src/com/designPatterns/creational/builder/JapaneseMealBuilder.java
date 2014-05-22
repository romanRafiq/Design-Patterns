/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.creational.builder;

/**
 *
 * @author Roman
 */
public class JapaneseMealBuilder implements MealBuilder{
    
    //Instance of a class
    Meal meal;

    //Constructor
    public JapaneseMealBuilder()
    {
        this.meal = new Meal();        
    }
    
            
            
    @Override
    public void buildDrink() {
        meal.setDrink("sake");
    }

    @Override
    public void buildMainCourse() {
        meal.setMainCourse("noodles");
    }

    @Override
    public void buildSide() {
        meal.setSide("soup");
    }

    @Override
    public String getMeal() {
        return meal.getMeal();
    }
}
