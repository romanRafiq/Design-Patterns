/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.state;

/**
 *
 * @author Roman
 */

//Concrete State
public class HappyState implements EmotionalState{

    @Override
    public String sayHello() {
        return "Hello, friend!";
    }

    @Override
    public String sayBye() {
        return "Bye, friend!";
    }
    
}
