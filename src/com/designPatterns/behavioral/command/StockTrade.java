/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.command;

/**
 *
 * @author Roman
 */
//Reciever
public class StockTrade {
    
    //Both should of been voids and perform functions
    //but i made it String to return a value to test it
    public  String buy()
    {
        return "Buying";
    }
    public String sell()
    {
        return "Selling";
    }
    
}
