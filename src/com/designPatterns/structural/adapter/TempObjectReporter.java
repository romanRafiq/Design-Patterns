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
public class TempObjectReporter implements TempInfo{

    //variable
    CeliusReporter celiusReporter;
    
    public TempObjectReporter() {
        celiusReporter = new CeliusReporter();
    }
    
    @Override
    public double getTempInF() {
    return cToF(celiusReporter.getTemp());
    }

    @Override
    public void setTempInF(double tempInF) {
       celiusReporter.setTemp(fToC(tempInF));
    }

    @Override
    public double getTempInC() {
        return celiusReporter.getTemp();
    }

    @Override
    public void setTempInC(double tempInC) {
        celiusReporter.setTemp(tempInC);
    }
    
    //Calculations
    private double fToC(double f) {
        return ((f - 32) * 5 / 9);
    }

    private double cToF(double c) {
        return ((c * 9 / 5) + 32);
    } 
    
}
