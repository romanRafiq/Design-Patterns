/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.structural;

import com.designPatterns.structural.composite.Composite;
import com.designPatterns.structural.composite.Leaf;
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
public class CompositeTest {
    
    public CompositeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
      Leaf leafOne = new Leaf("Jack");
        Leaf leafTwo = new Leaf("Jill");
        Leaf leafThree = new Leaf("Bill");
        Leaf leafFour = new Leaf("Will");
        Leaf leafFive = new Leaf("John");
       
        //First list of components
        Composite compositeOne = new Composite();
        compositeOne.add(leafOne);
        compositeOne.add(leafTwo);
        
        //Test That there are 2 components in the List
        Assert.assertEquals(compositeOne.getComponents().size(),2);
       
        //Second list of components
        Composite compositeTwo = new Composite();
        compositeTwo.add(leafThree);
        compositeTwo.add(leafFour);
       
        //Third list of components , this adds all the components to thois list
        Composite compositeThree = new Composite();
        compositeThree.add(compositeOne);
        compositeThree.add(compositeTwo);
        compositeThree.add(leafFive);
       
       
        compositeOne.sayHello();//First list  say hello
        Assert.assertEquals(leafTwo.getOuput(),"Jill says hello!");
        
        compositeTwo.sayHello();//Second list Say hello
        compositeThree.sayGoodBye(); //Everyone say goodbye
        
        Assert.assertEquals(leafOne.getOuput(),"Jack say goodbye!");
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
