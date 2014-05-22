/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.structural.composite;

/**
 *
 * @author Roman
 */
public class Leaf implements Components{

    String name;
    
    private String output;
    //Constructor
    public Leaf(String name)
    {
        this.name = name;
    }
    
    @Override
    public void sayHello() {
       output = name + " says hello!";
    }

    @Override
    public void sayGoodBye() {
        output = name + " say goodbye!";
    }
    
    public String getOuput()
    {
        return output;
    }
    
}
