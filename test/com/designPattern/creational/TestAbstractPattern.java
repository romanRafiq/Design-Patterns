/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.creational;

import com.designPatterns.creational.abstractFactory.AbstractFactory;
import com.designPatterns.creational.abstractFactory.Animal;
import com.designPatterns.creational.abstractFactory.SpeciesFactory;
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
public class TestAbstractPattern {
    
    public TestAbstractPattern() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestingReptiles() 
    {
        AbstractFactory abstractfactory = new AbstractFactory();
        
        SpeciesFactory speciesFactory = abstractfactory.getSpeciesFactory("Reptile");        
        Animal a1 = speciesFactory.getAnimal("Tyrannosaurus");                            
        Assert.assertEquals(a1.makeSound(), "Roar");
        //test second Reptile
        
        Animal a2 = speciesFactory.getAnimal("snake");
        Assert.assertEquals(a2.makeSound(), "Hiss");        
    }
    
    @Test
    public void TestMammals() 
    {
       AbstractFactory abstractfactory = new AbstractFactory();
        
       SpeciesFactory speciesFactory = abstractfactory.getSpeciesFactory("Mammal");        
       Animal a1 = speciesFactory.getAnimal("dog");                            
        Assert.assertEquals(a1.makeSound(), "Woof");
        
        //test second Mammal        
        Animal a2 = speciesFactory.getAnimal("cat");
        Assert.assertEquals(a2.makeSound(), "Meow");    
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
