/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.creational.tests;

import com.designPatterns.creational.builder.ItalianMealBuilder;
import com.designPatterns.creational.builder.JapaneseMealBuilder;
import com.designPatterns.creational.builder.MealBuilder;
import com.designPatterns.creational.builder.MealDirector;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Roman
 */
public class TestBuilderPatter {
    
    public TestBuilderPatter() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testItalianMealBuilder()
    {
        MealBuilder mealBuilder = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        
        mealDirector.constructMeal();//Construting of meal
        
         //Test Italian meal
        Assert.assertEquals(mealDirector.getMeal(), "wine pizza bread");
       
       
    }
    
     @Test
    public void testJapaneseMealBuilder()
    {
        MealBuilder mealBuilder = new JapaneseMealBuilder();
        
        MealDirector mealDirector = new MealDirector(mealBuilder);//meal director directs the construction of a meal
        
        mealDirector.constructMeal();//Construting of meal
        
        //Test Japan meal
        Assert.assertEquals(mealDirector.getMeal(), "sake noodles soup");
               
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
