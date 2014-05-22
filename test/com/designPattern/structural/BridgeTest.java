/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.structural;

import com.designPatterns.structural.bridge.BigBus;
import com.designPatterns.structural.bridge.BigEngine;
import com.designPatterns.structural.bridge.SmallCar;
import com.designPatterns.structural.bridge.SmallEngine;
import com.designPatterns.structural.bridge.Vehicle;
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
public class BridgeTest {
    
    public BridgeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestBigVehicle() 
     {
        Vehicle vehicle = new BigBus(new SmallEngine());//Give bus small engine
        vehicle.drive();//bus driving
        
        Assert.assertEquals(vehicle.getRatio(),30);
        vehicle.setEngine(new BigEngine());//Give bus a big engine
        vehicle.drive();
        Assert.assertEquals(vehicle.getRatio(),8);
        
     }
      @Test
     public void TestSmallVehicle() 
     {
        
        Vehicle  vehicle = new SmallCar(new SmallEngine());
        vehicle.drive();//Car is driving
               
        Assert.assertEquals(vehicle.getRatio(),6);
        vehicle.setEngine(new BigEngine());//Give small Car big engine
        vehicle.drive();
         Assert.assertEquals(vehicle.getRatio(),1);
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
