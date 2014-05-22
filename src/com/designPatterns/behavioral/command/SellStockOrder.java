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
public class SellStockOrder implements Order{
    
    private StockTrade stock;
    public SellStockOrder ( StockTrade stock) {
        this.stock = stock;
    }
    @Override
    public String execute( ) {//should be a void
        
        return stock.sell( );
    }
}
