   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.observer;

/**
 *
 * @author Roman
 */
public interface WeatherSubject {
    
    public void addObserver(WeatherObsserver weatherObserver);
    public void removeObserver(WeatherObsserver weatherObserver);
    public void doNotify();
    
}
