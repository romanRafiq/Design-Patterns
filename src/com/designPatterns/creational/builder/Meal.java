/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.creational.builder;

/**
 *
 * @author Roman
 */
public class Meal {
 
    //variables
    private String drink;
    private String mainCourse;
    private String side;
    

    //getters
     public String getDrink() {
        return drink;
    }
     
     public String getMainCourse() {
        return mainCourse;
    }
     
      public String getSide() {
        return side;
    }
      
      
     
     //setters
    public void setDrink(String drink) {
        this.drink = drink;
    }

    

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }
   

    public void setSide(String side) {
        this.side = side;
    }
   
    //Normally used as toString Method
     public String getMeal() {
        return drink + " " + mainCourse + " " + side;
    }
   
}
