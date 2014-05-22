/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.chainOfResponses;

/**
 *
 * @author Roman
 */
public abstract class GradeHandler {
    
    GradeHandler successor;
    
    
    
    public void setSuccessor(GradeHandler successor)
    {
        this.successor = successor;
    }           
    
    
    public abstract void handleGrading(Request request);//Gets grade
    
}
