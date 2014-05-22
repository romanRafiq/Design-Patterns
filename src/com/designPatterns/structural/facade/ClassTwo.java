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
public class ClassTwo {
    
    public int doSomethingToo(ClassOne classOne,int a)
    {
        return 2 * classOne.doSomething(a);
    }
    
}
