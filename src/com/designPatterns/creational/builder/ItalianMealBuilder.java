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
public class ItalianMealBuilder implements MealBuilder{

    //Instance of a class
    private Meal meal;
    
    //constructor
    public ItalianMealBuilder()
    {
        this.meal = new Meal();
    }
    
    @Override
    public void buildDrink() {
        meal.setDrink("wine");
    }

    @Override
    public void buildMainCourse() {
        meal.setMainCourse("pizza");
    }

    @Override
    public void buildSide() {
        meal.setSide("bread");
    }

    @Override
    public String getMeal() {
        return meal.getMeal();
    }
    
    
}
