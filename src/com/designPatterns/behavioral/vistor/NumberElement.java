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

/*
    This interface has a single method that 
    takes a NumberVisitor as an argument.
    All elements will implement this interface
*/
public interface NumberElement {
    public void accept (NumberVistor vistor);
}
