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
public class MealDirector {
    private MealBuilder mealBuilder = null;
    
    //Constructor
    public MealDirector(MealBuilder mealBuilder)
    {
        this.mealBuilder = mealBuilder;
    }
    
    //Construct a meal
    public void constructMeal()
    {
        mealBuilder.buildDrink();
        mealBuilder.buildMainCourse();
        mealBuilder.buildSide();
    }
    
    public String getMeal()
    {
        return mealBuilder.getMeal();
    }
}
