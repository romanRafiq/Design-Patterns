/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.memento;

/**
 *
 * @author Roman
 */

//Originator - Object who state we want to save
public class DietInfo {
    
    String personName;
    int dayNumber;
    int weight;
    
    //Construct
    public DietInfo(String personName,int dayNumber,int weight)
    {
        this.personName = personName;
        this.weight = weight;
        this.dayNumber = dayNumber;
    }    
    
    //Set dayNumbers and weight
    public void setDayNumberAndWeight(int dayNumber, int weight) 
    {
	this.dayNumber = dayNumber;
	this.weight = weight;
    }
    
    //Save Memento
    public Memento save() 
    {   //Return a new object
	return new Memento(personName, dayNumber, weight);
    }
    
    //To restore Object
    public void restore(Object objMemento) 
    {
        //Copy the obeject back to this object
	Memento memento = (Memento) objMemento;//casting object to class
	personName = memento.mementoPersonName;
	dayNumber = memento.mementoDayNumber;
	weight = memento.mementoWeight;
    }

	// memento - object that stores the saved state of the originator
    private class Memento {
        
        //variables
        String mementoPersonName;
	int mementoDayNumber;
	int mementoWeight;

        //constructor
	public Memento(String personName, int dayNumber, int weight) 
        {
		mementoPersonName = personName;
		mementoDayNumber = dayNumber;
		mementoWeight = weight;
	}
    }
     //getters
     public int getDay() 
     {
         return dayNumber;
     }
     
     public int getWeight()
     {
         return weight;
     }
     
    
    //Object string override
     public String toString() 
     {
         return "Name: " + personName + ", day number: " + dayNumber + ", weight: " + weight;
     }

}
