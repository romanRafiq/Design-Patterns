/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.structural.Test;

import com.designPatterns.structural.facade.Facade;
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
public class FacadeTesting {
    
    public FacadeTesting() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCubeX() 
    {
        Facade facade = new Facade();
        int a = 5;//TestVariable
        
        //Cube of a
        Assert.assertEquals(facade.cubeX(a),125);
        //Cube of a *2
        Assert.assertEquals(facade.cubeXTimesTwo(a),250);
        //a to sixth power * 2
        Assert.assertEquals(facade.inceptionTime(a),31250);

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
