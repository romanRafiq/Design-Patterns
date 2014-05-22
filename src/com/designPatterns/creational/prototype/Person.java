/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.creational.prototype;

/**
 *
 * @author Roman
 */
public class Person implements Prototype{

    //variables
    private String name;
    
    //constructor
    public Person(String name)
    {
        this.name = name;
    }
    
    @Override
    public Prototype doClone() {
        return new Person(name);
    }
    
    public String getName()
    {
        return name;
    }
}
