/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.behavioral.tests;

import com.designPatterns.behavioral.strategy.Context;
import com.designPatterns.behavioral.strategy.HikerStrategy;
import com.designPatterns.behavioral.strategy.SkiStrategy;
import com.designPatterns.behavioral.strategy.Strategy;
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
public class StrategyTest {
    
    public StrategyTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testMethod() 
    {
        //Variabe used for testing
        //int temperatureInF = 60;

        Strategy skiStrategy = new SkiStrategy();
        
	Context context = new Context(60, skiStrategy);//Change number here
        //Remember to go ski the temp mst be below 32
        Assert.assertFalse(context.getResult());//Should return false its too hot
        
        
        context = new Context(20, skiStrategy);//Change number here
        Assert.assertTrue(context.getResult());//return true its its the right weather

        //Second Test
	Strategy hikeStrategy = new HikerStrategy();
        
        context = new Context(60, hikeStrategy);	
        Assert.assertTrue(context.getResult());//return true its its the right weather
        
        
        context = new Context(40, hikeStrategy);	
        Assert.assertFalse(context.getResult());//return false its its the too cold
	

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
