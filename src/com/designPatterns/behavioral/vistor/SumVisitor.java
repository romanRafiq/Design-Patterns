/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.vistor;

import java.util.List;

/**
 *
 * @author Roman
 */
public class SumVisitor implements NumberVistor{

    @Override
    public void visit(TwoElement twoElement) {
        
        int sum = twoElement.a + twoElement.b;              
    }

    @Override
    public void visit(ThreeElement threeElement) {
        int sum = threeElement.a + threeElement.b + threeElement.c;       
    }

    @Override
    public void visit(List<NumberElement> elementList) {
        
        for (NumberElement ne : elementList) 
        {
            ne.accept(this);
	}
    }
    
}
