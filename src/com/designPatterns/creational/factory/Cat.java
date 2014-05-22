/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.creational.factory;

/**
 *
 * @author Roman
 */
public class Cat implements Animal{

    @Override
    public String makeSound() {
        return "Meow";
    }
    
}
