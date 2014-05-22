/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.creational.singelton;

/**
 *
 * @author Roman
 */
public class Singleton {
    
    private static Singleton singleton = null;
    
    private Singleton()
    {}
    
    public static Singleton getSingleton()
    {
        if(singleton == null)
        {
            singleton = new Singleton();            
        }
        
        return singleton;
    }
    
    public String sayHello()
    {
        return "Hello world";
    }
    
    
    
}
