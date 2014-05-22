/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.creational.abstractFactory;

/**
 *
 * @author Roman
 */
public class AbstractFactory {
    
   public SpeciesFactory getSpeciesFactory(String type)
   {
       if(type.equals("Mammal"))           
       {
           return new MammalFactory();//return correct Class
       }
       else
       {
           return new ReptileFactory();//return correct Class
       }
       
   }

    
}
