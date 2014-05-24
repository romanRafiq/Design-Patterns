/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.behavioral.tests;

import com.designPatterns.behavioral.state.HappyState;
import com.designPatterns.behavioral.state.Person;
import com.designPatterns.behavioral.state.SadState;
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
public class StateTest {
    
    public StateTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testState() 
    {
        //Making an object and also referencing it to a concrete class
        Person person = new Person(new HappyState());
        
        //test that it does communicate with the concrete classes
	Assert.assertEquals(person.sayHello(),"Hello, friend!");
	Assert.assertEquals(person.sayBye(),"Bye, friend!");

        //Test Sad State
	person.setEmotionalState(new SadState());//Set New State
        
        //Run test
	Assert.assertEquals(person.sayHello(),"Hello. Sniff, sniff.");
	Assert.assertEquals(person.sayBye(),"Bye. Sniff, sniff.");                
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
