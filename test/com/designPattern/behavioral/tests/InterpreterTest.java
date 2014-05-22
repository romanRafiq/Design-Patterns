/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.behavioral.tests;

import com.designPatterns.behavioral.interpreter.Context;
import com.designPatterns.behavioral.interpreter.Expression;
import com.designPatterns.behavioral.interpreter.HundredExpression;
import com.designPatterns.behavioral.interpreter.OneExpression;
import com.designPatterns.behavioral.interpreter.TenExpression;
import com.designPatterns.behavioral.interpreter.ThousandExpression;
import java.util.ArrayList;
import java.util.Iterator;
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
public class InterpreterTest {
    
    public InterpreterTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestApp()
    {//                             1000 900+10+10+5+1+1+1 = 1928          
       String roman = "MCMXXVIII";//1000 100 10 10 1 1 1 1
	      Context context = new Context(roman);

	      // Build the 'parse tree' 
	      ArrayList<Expression> tree = new ArrayList<Expression>();
	      tree.add(new ThousandExpression());
	      tree.add(new HundredExpression());
	      tree.add(new TenExpression());
	      tree.add(new OneExpression());

	      // Interpret 
	      for (Iterator it = tree.iterator(); it.hasNext();)
	      {
	    	  Expression exp = (Expression)it.next();
	    	  exp.interpret(context);
	      }	   
              Assert.assertEquals(context.getOutput(),1928);
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
