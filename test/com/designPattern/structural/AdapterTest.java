/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.structural;

import com.designPatterns.structural.adapter.TempClassReporter;
import com.designPatterns.structural.adapter.TempInfo;
import com.designPatterns.structural.adapter.TempObjectReporter;
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
public class AdapterTest {
    
    public AdapterTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testClass()
     {
         // Class adapter
        TempInfo tempInfo = new TempClassReporter();
        //specify temp in celius
        tempInfo.setTempInC(0);
        
        Assert.assertEquals(tempInfo.getTempInC(), 0.0);//test value in celius
        Assert.assertEquals(tempInfo.getTempInF(), 32.0);//test value in F*
        
        tempInfo.setTempInF(86);//Give value in F*
        Assert.assertEquals(tempInfo.getTempInC(), 30.0);//Conversion to celius
        Assert.assertEquals(tempInfo.getTempInF(), 86.0);
       
        
        
       
     }
     @Test
     public void testObjectAdapter()
     {
         // Object adapter
         TempInfo tempInfo = new TempObjectReporter();
         tempInfo.setTempInC(0);
        
         Assert.assertEquals(tempInfo.getTempInC(), 0.0);
         Assert.assertEquals(tempInfo.getTempInF(), 32.0);
        
         tempInfo.setTempInF(86);
         Assert.assertEquals(tempInfo.getTempInC(), 30.0);
         Assert.assertEquals(tempInfo.getTempInF(), 86.0);

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
