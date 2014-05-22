/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roman
 */

//Invoker
public class Agent {
    private List ordersQueue = new ArrayList();
    
    //Constructor
    public Agent()
    {}
    
    public String placeOrder(Order order)
    {
        ordersQueue.add(order); 
        
        return order.execute();
    }
    public List getOrderList()
    {
        return ordersQueue;
    }
    
    
}
