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

// caretaker - saves and restores a DietInfo object's state via a memento
// DietInfo.Memento isn't visible to the caretaker so we need to cast the memento to Object
public class DietInfoCareTaker {
    
    Object objMemento;

    public void saveState(DietInfo dietInfo) 
    {
	objMemento = dietInfo.save();//Returns and object
    }

    public void restoreState(DietInfo dietInfo) 
    {
	dietInfo.restore(objMemento);//setobject to former state
    }
    
}
