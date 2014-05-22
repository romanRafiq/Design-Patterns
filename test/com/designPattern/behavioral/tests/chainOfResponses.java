package com.designPattern.behavioral.tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.designPatterns.behavioral.chainOfResponses.GradHandlerB;
import com.designPatterns.behavioral.chainOfResponses.GradeHandler;
import com.designPatterns.behavioral.chainOfResponses.GradeHandlerA;
import com.designPatterns.behavioral.chainOfResponses.GradeHandlerC;
import com.designPatterns.behavioral.chainOfResponses.Request;
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
public class chainOfResponses {
    
    public chainOfResponses() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestGrading() 
    {
       //Make Chain                
        GradeHandler gradeA = new  GradeHandlerA();
        GradeHandler gradeB = new  GradHandlerB();     
        GradeHandler gradeC = new GradeHandlerC();
        
        gradeA.setSuccessor(gradeB);
        gradeB.setSuccessor(gradeC);                
        
                
        //Test for C grading
        Request request = new Request(60);         
        gradeA.handleGrading(request);     
        
        Assert.assertEquals(request.getGrading(),"C");
        
        //Test for A grading
       request = new Request(80);
        gradeA.handleGrading(request);             
        Assert.assertEquals(request.getGrading(),"A");
        
        //Test for B grading
        request = new Request(70);
        gradeA.handleGrading(request);         
        Assert.assertEquals(request.getGrading(),"B");
      
       
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
