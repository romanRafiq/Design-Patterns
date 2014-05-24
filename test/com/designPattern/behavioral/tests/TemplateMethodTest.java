/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.behavioral.tests;

import com.designPatterns.behavioral.templateMethod.HamburgerMeal;
import com.designPatterns.behavioral.templateMethod.Meal;
import com.designPatterns.behavioral.templateMethod.TacoMeal;
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
public class TemplateMethodTest {
    
    public TemplateMethodTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestMeal()
    {
        //Make a hambuger meal
        Meal meal1 = new HamburgerMeal();        
	meal1.doMeal(); //now eat the burger        	                

        //Make Taco meal
	Meal meal2 = new TacoMeal();//Make meal object and implement TacoMeal()
                
	Assert.assertEquals(meal2.doMeal(),"had meal");//Perform All Abtstracts()
        //Show that the eat method awas override
        Assert.assertEquals(meal1.eat(),"eating");
        Assert.assertEquals(meal2.eat(),"Mmm leka");
        Assert.assertNotEquals(meal2.eat(),"eating");
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
