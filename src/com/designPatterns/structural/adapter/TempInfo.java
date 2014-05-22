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
public interface TempInfo {
    
    public double getTempInF();
   
    public void setTempInF(double tempInF);
   
    public double getTempInC();
   
    public void setTempInC(double tempInC);
}
