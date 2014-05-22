/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Roman
 */
public class Composite implements Components{

    //make a new List of component class
    List<Components> components = new ArrayList<Components>();
    
    @Override
    public void sayHello() {
        //This goes through the list assigning every component output variable to say hello
        for (Components component :components) {
            component.sayHello();
        }
    }

    @Override
    public void sayGoodBye() {
        //This goes through the list assigning every component output variable to goodbye
         for (Components component : components) {
            component.sayGoodBye();
        }
    }
    
    //Adding of components
    public void add(Components component) {
        components.add(component);
    }

    //removing a component
    public void remove(Components component) {
        components.remove(component);
    }

    //get list of components
    public List<Components> getComponents() {
        return components;
    }

    //get component by index
    public Components getComponent(int index) {
        return components.get(index);
    }
    
}
