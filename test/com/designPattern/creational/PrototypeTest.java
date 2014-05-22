/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.creational;

import com.designPatterns.creational.prototype.Dog;
import com.designPatterns.creational.prototype.Person;
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
public class PrototypeTest {
    
    public PrototypeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void testPerson()
    {
        Person personOne = new Person("Rafiq");
        Assert.assertEquals(personOne.getName(), "Rafiq");
        
        //testClone
        Person personTwo = (Person) personOne.doClone();
        Assert.assertEquals(personTwo.getName(), "Rafiq");                       
    }
    @Test
    public void testDog()
    {
        Dog dogOne = new Dog("Woof");
        Assert.assertEquals(dogOne.getSound(), "Woof");
        Dog dogTwo = (Dog) dogOne.doClone();
        Assert.assertEquals(dogTwo.getSound(), "Woof");

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
