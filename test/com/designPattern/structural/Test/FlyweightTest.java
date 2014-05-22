/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.structural.Test;

import com.designPatterns.structural.flyweight.FlyWeightFactory;
import com.designPatterns.structural.flyweight.Flyweight;
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
public class FlyweightTest {
    
    public FlyweightTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestIt()
    {
        
        //Create new Obejct
        FlyWeightFactory flyweightFactory = FlyWeightFactory.getInstance();
       
         Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
         Assert.assertEquals(flyweightAdder.doMath(8, 8),16);
         
         Flyweight flyweightMultiplier = flyweightFactory.getFlyweight("multiply");
         Assert.assertEquals(flyweightMultiplier.doMath(10, 7),70);
                  
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
