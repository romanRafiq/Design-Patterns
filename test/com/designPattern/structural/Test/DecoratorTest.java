/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.structural.Test;

import com.designPatterns.structural.decorator.Animal;
import com.designPatterns.structural.decorator.GrowlDecorator;
import com.designPatterns.structural.decorator.LegDecorator;
import com.designPatterns.structural.decorator.LivingAnimal;
import com.designPatterns.structural.decorator.WingDecorator;
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
public class DecoratorTest {
    
    public DecoratorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test()
    {
        /*          
        only access the shared operations of the Animal interface e.g describe(),
        instead of using the interface,        
        */
        
        Animal animal = new LivingAnimal();
        
        Assert.assertEquals(animal.describe(),"I am an animal");       
        
        animal = new LegDecorator(animal);
       Assert.assertEquals(animal.describe(),"I can walk");        

        animal = new WingDecorator(animal);
        Assert.assertEquals(animal.describe(),"I spread my wings and fly away!");        

        animal = new GrowlDecorator(animal);
       Assert.assertEquals(animal.describe(),"Grrr");       
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
