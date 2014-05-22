/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.chainOfResponses;

/**
 *
 * @author Roman
 */
public class Request {
    //variables
    private int requested_value;
    private String grading;
    
    public Request(int requested_value)
    {
        this.requested_value = requested_value;
    }
    
    //getters
    public int getValue()
    {
        return requested_value;
    }
    
    public String getGrading()
    {
        return grading;
    }
    //setter
    public void setGrade(String grading)
    {
        this.grading = grading;
    }
    
}
