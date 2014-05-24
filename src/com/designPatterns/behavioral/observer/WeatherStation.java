/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Roman
 */
public class WeatherStation implements WeatherSubject{
    
    Set<WeatherObsserver> weatherObservers;
    int temperature;

    //Constructor
    public WeatherStation(int temperature)
    {
        weatherObservers = new HashSet<WeatherObsserver>();
        this.temperature = temperature;
    }
    
    //Implementation methods
    @Override
    public void addObserver(WeatherObsserver weatherObserver) {
        weatherObservers.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObsserver weatherObserver) {
        weatherObservers.remove(weatherObserver);
    }

    @Override
    public void doNotify() {
        //return iterator of the hashmap
        Iterator<WeatherObsserver> it = weatherObservers.iterator();
        
        while(it.hasNext())
        {   //make object, of the set object that is returned         
            WeatherObsserver weatherObserver = it.next();
            
            weatherObserver.doUpdate(temperature);//
        }
        
    }
    
    //other methods
    public void setTemperature(int newTemperature) //setting of temperature
    {       
	temperature = newTemperature;//assign new temp to old temp
	
        doNotify();//notifies every observer
    }
    
}
