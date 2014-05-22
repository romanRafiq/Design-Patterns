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
public class TempClassReporter extends CeliusReporter implements TempInfo{

    @Override
    public double getTempInF() {
        return cToF(tempInC);
    }

    @Override
    public void setTempInF(double tempInF) {
        this.tempInC = fToC(tempInF);
    }

    @Override
    public double getTempInC() {
        return tempInC;
    }

    @Override
    public void setTempInC(double tempInC) {
        this.tempInC = tempInC;
    }

    private double fToC(double f) {
        return ((f - 32) * 5 / 9);
    }

    private double cToF(double c) {
        return ((c * 9 / 5) + 32);
    }
    
}
