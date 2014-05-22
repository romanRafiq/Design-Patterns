/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.interpreter;

/**
 *
 * @author Roman
 */
public abstract class Expression {
    
    public void interpret(Context context)
    {
       //If input = zero exit
      if (context.getInput().length() == 0) 
        return;

      if (context.getInput().startsWith(nine()))
      {
        context.setOutput(context.getOutput() + (9 * multiplier()));
        context.setInput(context.getInput().substring(2));
      }
      else if (context.getInput().startsWith(four()))
      {
        context.setOutput(context.getOutput() + (4 * multiplier()));
        context.setInput(context.getInput().substring(2));
      }
      else if (context.getInput().startsWith(five()))
      {
        context.setOutput(context.getOutput() + (5 * multiplier()));
        context.setInput( context.getInput().substring(1));
      }

      while(context.getInput().startsWith(one()))
      {//If there are "I"s then this will be like to add all the ones nd until find a new roman number
        context.setOutput(context.getOutput() + (1 * multiplier()));
        context.setInput(context.getInput().substring(1));
      }
    }

    public abstract String one();
    public abstract String four();
    public abstract String five();
    public abstract String nine();
    public abstract int multiplier();
	
}
