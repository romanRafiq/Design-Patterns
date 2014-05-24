/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.behavioral.tests;

import com.designPatterns.behavioral.observer.WeatherCustomer1;
import com.designPatterns.behavioral.observer.WeatherCustomer2;
import com.designPatterns.behavioral.observer.WeatherStation;
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
public class ObserverTest {
    
    public ObserverTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestObserver()
    {
        WeatherStation weatherStation = new WeatherStation(33);
		
	WeatherCustomer1 cust1 = new WeatherCustomer1();
	WeatherCustomer2 cust2 = new WeatherCustomer2();
        WeatherCustomer2 cust3 = new WeatherCustomer2();
	
        //Add customers(objects) to the a list
        weatherStation.addObserver(cust1);
	weatherStation.addObserver(cust2);
        weatherStation.addObserver(cust3);


	weatherStation.setTemperature(34);
        //See if the 2 customer(objects) were notified
        Assert.assertEquals(cust1.getTemperature(),34);
        Assert.assertEquals(cust2.getTemperature(),34);
	Assert.assertEquals(cust3.getTemperature(),34);
        
	weatherStation.removeObserver(cust1);//removing a customer                
	weatherStation.setTemperature(35);
        
        Assert.assertEquals(cust2.getTemperature(),35);//Proves that the value was updated
        Assert.assertNotEquals(cust2.getTemperature(),34);
        
        Assert.assertEquals(cust3.getTemperature(),35);//Proves that the value was updated
        
        //The following proves that a customer was deleted from the list
        //And its value of temp wasnt notified of the temp change
         Assert.assertEquals(cust1.getTemperature(),34);
        
        
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
