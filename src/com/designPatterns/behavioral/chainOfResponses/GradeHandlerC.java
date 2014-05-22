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
public class GradeHandlerC extends GradeHandler{

    @Override
    public void handleGrading(Request request) {
        
        if(request.getValue() >= 50)
        {
            request.setGrade("C");
        }
        else
        {
            if(successor != null)
            {
                successor.handleGrading(request);
            }
            
        }
    }
    
    
}
