/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Roman
 */
public class FlyWeightFactory {
   
    private static FlyWeightFactory flyWeightFactory;
    private Map<String, Flyweight> flyweightPool;

    //Constructor
    private FlyWeightFactory() {
        flyweightPool = new HashMap<String, Flyweight>();
    }
    
    //Constructor
    public static FlyWeightFactory getInstance() {
        if (flyWeightFactory == null) {
            flyWeightFactory = new FlyWeightFactory();
        }
        return flyWeightFactory;
    }

    public Flyweight getFlyweight(String key) {
        if (flyweightPool.containsKey(key)) {
            return flyweightPool.get(key);
        } else {
            Flyweight flyweight;
            if (key.equals("add")) {
                flyweight = new FlyweightAdder();
            } else {
                flyweight = new FlyWeightMultiplier();
            }
            flyweightPool.put(key, flyweight);
            return flyweight;
        }
    } 
}
