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
public class ClassThree {
    
    public int doSomethingInception(ClassOne classOne,
    ClassTwo classTwo,int a)
    {
        return classOne.doSomething(a) * classTwo.doSomethingToo(classOne, a);
    }
}
