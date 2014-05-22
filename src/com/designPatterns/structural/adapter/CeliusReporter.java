/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.structural.adapter;

/**
 *
 * @author Roman
 */
public class CeliusReporter {
    
    //attribute
    double tempInC;
    
    //COnstructor
    public CeliusReporter()
    {        
    }
    
    //Getter
    public double getTemp()
    {
        return tempInC;
    }
    
    //setter
    public void setTemp(double tempInC)
    {
        this.tempInC = tempInC;
    }
    
}
