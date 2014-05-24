/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.behavioral.tests;

import com.designPatterns.behavioral.vistor.NumberElement;
import com.designPatterns.behavioral.vistor.SumVisitor;
import com.designPatterns.behavioral.vistor.ThreeElement;
import com.designPatterns.behavioral.vistor.TwoElement;
import com.designPatterns.behavioral.vistor.NumberVistor;
import com.designPatterns.behavioral.vistor.TotalSumVistor;
import java.util.ArrayList;
import java.util.List;
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
public class VisitorTest {
    
    public VisitorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestVisitor() 
    {
        
        //Mave objects and initialize
	TwoElement two1 = new TwoElement(3, 3);
	TwoElement two2 = new TwoElement(2, 7);
	ThreeElement three1 = new ThreeElement(3, 4, 5);

        //Create a list with class datatype
	List<NumberElement> numberElements = new ArrayList<NumberElement>();
	
        //Add objects to list
        numberElements.add(two1);
	numberElements.add(two2);
	numberElements.add(three1);
        
        
        //Create instance of a class Referancing the sumVisitor()
	NumberVistor sumVisitor = new SumVisitor();        
	
        //we visit the list with the SumVisitor
        sumVisitor.visit(numberElements);	
	         
        //create a TotalSumVisitor 
        TotalSumVistor totalSumVisitor = new TotalSumVistor();
	
        totalSumVisitor.visit(numberElements);//visit the list with the TotalSumVisitor
	
        //get TotalSum and test is       
        Assert.assertEquals(totalSumVisitor.getTotalSum(),27);//the test should be 27

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
