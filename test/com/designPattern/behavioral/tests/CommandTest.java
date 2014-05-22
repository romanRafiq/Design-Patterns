/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.behavioral.tests;

import com.designPatterns.behavioral.Command.Agent;
import com.designPatterns.behavioral.Command.BuyStockOrder;
import com.designPatterns.behavioral.Command.Order;
import com.designPatterns.behavioral.Command.SellStockOrder;
import com.designPatterns.behavioral.Command.StockTrade;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Roman
 */
public class CommandTest {
    
    public CommandTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void TestApps() {
         StockTrade stock = new StockTrade();
        BuyStockOrder bsc = new BuyStockOrder (stock);
        SellStockOrder ssc = new SellStockOrder (stock);
        Agent agent = new Agent();

        Assert.assertEquals(agent.placeOrder(bsc),"Buying"); // Buy Shares
        Assert.assertEquals(agent.placeOrder(ssc),"Selling"); // Sell Shares             
        
        //2 Entries in the list
        Assert.assertEquals(agent.getOrderList().size(),2);        
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
