/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.interpreter;

/**
 *
 * @author Roman
 */
public class Context {
    
    //Variables
    private String input;
    private int output;
    
    //Constructor
    public Context(String input)
    {
      this.input = input;
    }
    
    
    //Getters    
    public String getInput()
    {
      return input;
    }                 
    
    public int getOutput()
    {
      return output;
    }
   
    //Setters
     public void setInput(String input)
    {
      this.input = input; 
    }  
     
      public void setOutput(int output)
    {
      this.output = output;
    }   
}
