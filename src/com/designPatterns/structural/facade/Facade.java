/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.structural.facade;

/**
 *
 * @author Roman
 */
public class Facade {
    
    public int cubeX(int a) {
        ClassOne classOne = new ClassOne();//Creat object
        return classOne.doSomething(a);//return value
    }
   
    public int cubeXTimesTwo(int a) {
        ClassOne classOne = new ClassOne();
        ClassTwo classTwo = new ClassTwo();
        return classTwo.doSomethingToo(classOne, a);
    }
   
    public int inceptionTime(int a) {
        ClassOne classOne = new ClassOne();
        ClassTwo classTwo = new ClassTwo();
        ClassThree classThree = new ClassThree();
        return classThree.doSomethingInception(classOne, classTwo, a);
    }
}
