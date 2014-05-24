/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.behavioral.tests;

import com.designPatterns.behavioral.mediator.Buyer;
import com.designPatterns.behavioral.mediator.FrenchBuyer;
import com.designPatterns.behavioral.mediator.Mediator;
import com.designPatterns.behavioral.mediator.SwedishBuyer;
import com.designPatterns.behavioral.mediator.AmericanSeller;
import com.designPatterns.behavioral.mediator.DollarConverter;
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
public class MediatorTest {
    
    public MediatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Testmediator()
    {
        Mediator mediator = new Mediator();
        
        Buyer swedishBuyer = new SwedishBuyer(mediator);
        Buyer frenchBuyer = new FrenchBuyer(mediator);
        
        float sellingPriceInDollars = 10.0f;
        
        AmericanSeller americanSeller = new AmericanSeller(mediator,sellingPriceInDollars);
        DollarConverter dollarConverter = new DollarConverter(mediator);
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
