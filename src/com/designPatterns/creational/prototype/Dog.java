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
public class Dog implements Prototype{

    //Variables
    private String sound;
    
    //Constructor
    public Dog(String sound)
    {
        this.sound = sound;
    }
              
    @Override
    public Prototype doClone() {
        return new Dog(sound);
    }
    
    public String getSound()
    {
        return sound;
    }
}
