/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.behavioral.tests;

import com.designPatterns.behavioral.memento.DietInfo;
import com.designPatterns.behavioral.memento.DietInfoCareTaker;
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
public class MementoTest {
    
    public MementoTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testMethod() 
    {
        // caretaker
	DietInfoCareTaker dietInfoCaretaker = new DietInfoCareTaker();//make object

	// originator
	DietInfo dietInfo = new DietInfo("Fred", 1, 100);//Make object and initiate
	
        Assert.assertEquals(dietInfo.getDay(), 1);//Test day = 1
        Assert.assertEquals(dietInfo.getWeight(),100);//test weight = 100
        

	dietInfo.setDayNumberAndWeight(2, 99);//update the weight and day to 2 ,99
	
        Assert.assertEquals(dietInfo.getDay(), 2);//Test day = 2
        Assert.assertEquals(dietInfo.getWeight(),99);//test weight = 99

	//Save the object 
	dietInfoCaretaker.saveState(dietInfo);//Save state,  day 2, weight 99

        
        //changing state but not saving
	dietInfo.setDayNumberAndWeight(3, 98);//update the weight and day
	
        Assert.assertEquals(dietInfo.getDay(), 3);//Test day = 3
        Assert.assertEquals(dietInfo.getWeight(),98);//test weight = 98

	
        dietInfo.setDayNumberAndWeight(4, 97);//update again
	
        Assert.assertEquals(dietInfo.getWeight(),97);//test weight = 97
        

        //restoring saved state	
	dietInfoCaretaker.restoreState(dietInfo);//restore to known state
	Assert.assertEquals(dietInfo.getDay(), 2);//Test day = 2
        Assert.assertEquals(dietInfo.getWeight(),99);//test weight = 99

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
