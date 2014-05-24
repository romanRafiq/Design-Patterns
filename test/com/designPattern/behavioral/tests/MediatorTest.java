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
public class MediatorTest {
    
    public MediatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Testmediator()
    {
        //This test is a bidding app where uses the loop to like add more to the bidding to 
        //to find a value the bidder will accept
        
        //object
        Mediator mediator = new Mediator();
        
        /*
        create a SwedishBuyer object and a FrenchBuyer object. 
        */
        Buyer swedishBuyer = new SwedishBuyer(mediator);
	Buyer frenchBuyer = new FrenchBuyer(mediator);
        
	float sellingPriceInDollars = 10.0f;
        
	AmericanSeller americanSeller = new AmericanSeller(mediator, sellingPriceInDollars);//registers seller with the mediator
        
	DollarConverter dollarConverter = new DollarConverter(mediator); //registers with mediator 
                                                                        
        
        Assert.assertTrue(swedishBuyer.attemptToPurchase(85f));//Accept anything over 85Kronor = 10.625 dollars	

        
        Assert.assertTrue(frenchBuyer.attemptToPurchase(7.5f));//Accept anything over 7.5 Euros = 10.715 dollars	
        Assert.assertFalse(frenchBuyer.attemptToPurchase(6.5f));//Anything below 7.5 euros should return false
	
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
