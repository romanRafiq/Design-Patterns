/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.creational;

import com.designPatterns.creational.factory.Animal;
import com.designPatterns.creational.factory.AnimalFactory;
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
public class testFactory {
    
    public testFactory() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testfatctory() 
    {
        AnimalFactory animalFactory = new AnimalFactory();
        
        //Test If dog
        Animal animal = animalFactory.getAnimal("dog");                
        Assert.assertEquals(animal.makeSound(), "Woof");
        
        //test if cat
        animal = animalFactory.getAnimal("cat");
        Assert.assertEquals(animal.makeSound(), "Meow");
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
