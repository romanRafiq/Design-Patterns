/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.strategy;

/**
 *
 * @author Roman
 */
public class SkiStrategy implements Strategy{

    @Override
    public boolean checkTemperature(int temperatureInF) {
        //Return true if temperature is less than 32*f
        if(temperatureInF <= 32)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    
}
