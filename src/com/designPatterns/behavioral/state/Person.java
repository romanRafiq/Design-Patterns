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

//Context class
public class Person implements EmotionalState{
    
    //Object with a reference to the State(intereface)
    EmotionalState emotionalState;

    //Constructor
    public Person(EmotionalState emotionalState) 
    {
	this.emotionalState = emotionalState;
    }

    public void setEmotionalState(EmotionalState emotionalState) 
    {
	this.emotionalState = emotionalState;
    }

    @Override
    public String sayBye() 
    {
	return emotionalState.sayBye();
    }

    @Override
    public String sayHello() 
    {
	return emotionalState.sayHello();
    }  
    
}
