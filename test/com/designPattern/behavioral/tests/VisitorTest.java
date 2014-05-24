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
import java.util.ArrayList;
import java.util.List;
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
        
	TwoElement two1 = new TwoElement(3, 3);
	TwoElement two2 = new TwoElement(2, 7);
	ThreeElement three1 = new ThreeElement(3, 4, 5);

	List<NumberElement> numberElements = new ArrayList<NumberElement>();
	numberElements.add(two1);
	numberElements.add(two2);
	numberElements.add(three1);

	System.out.println("Visiting element list with SumVisitor");
	NumberVisitor sumVisitor = new SumVisitor();
	sumVisitor.visit(numberElements);

	System.out.println("\nVisiting element list with TotalSumVisitor");
	TotalSumVisitor totalSumVisitor = new TotalSumVisitor();
	totalSumVisitor.visit(numberElements);
	System.out.println("Total sum:" + totalSumVisitor.getTotalSum());

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
