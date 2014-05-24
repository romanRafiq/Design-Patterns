/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.vistor;

/**
 *
 * @author Roman
 */
public class ThreeElement implements NumberElement{

    //Variables
    int a, b, c;
    
    //Constructor
    public ThreeElement(int a,int b,int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void accept(NumberVistor vistor) {
        vistor.visit(this);
    
    }
    
}
