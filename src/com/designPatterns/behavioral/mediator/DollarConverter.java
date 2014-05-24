/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.mediator;

/**
 *
 * @author Roman
 */
public class DollarConverter {
    
    Mediator mediator;
    public static final float DOLLAR_UNIT = 1.0f;
    public static final float EURO_UNIT = 0.7f;
    public static final float KRONA_UIT = 8.0f;
    
    public DollarConverter(Mediator mediator)
    {
        this.mediator = mediator;
        mediator.registerDollarConverter(this);
    }
    
    public float convertEurosToDollars(float euro)
    {
        float dollars = euro * (DOLLAR_UNIT / euro);
        System.out.println("converting "+euro+" euros to "+dollars+"dollars");
        return dollars;
    }
    
     public float convertKronorToDollars(float krono)
    {
        float dollars = krono * (DOLLAR_UNIT / krono);
        System.out.println("converting "+krono+" kronos to "+dollars+"dollars");
        return dollars;
    }
     
     public float convertCurrencyToDollars(float amount,String unitOfCurrency)
    {
        if("krona".equalsIgnoreCase(unitOfCurrency))
        {
            return convertKronorToDollars(amount);
        }
        else
        {
            return convertEurosToDollars(amount);
        }
        
    }
    
}
