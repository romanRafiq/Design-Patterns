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
//Concrete command class
public class BuyStockOrder implements Order{

    private StockTrade stock;
    
    public BuyStockOrder(StockTrade stock)
    {
        this.stock = stock;
    }
    
    
    @Override
    public String execute() {//should be a void but made it a string to test it
        return stock.buy();
    }
    
}
