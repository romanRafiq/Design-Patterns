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
public class TenExpression extends Expression{

    @Override
    public String one() {
        return "X";
    }

    @Override
    public String four() {
        return "Xl";
    }

    @Override
    public String five() {
        return "L";
    }

    @Override
    public String nine() {
        return "XC";
    }

    @Override
    public int multiplier() {
        return 10;
    }
    
}
