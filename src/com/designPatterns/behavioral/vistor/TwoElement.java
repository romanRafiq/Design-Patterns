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
public class TwoElement implements NumberElement{

    //Variables
    int a;
    int b;
    
    //Constructor
    public TwoElement(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
            
    //Implements
    @Override
    public void accept(NumberVistor vistor) 
    {
        vistor.visit(this);
    }
    
}
