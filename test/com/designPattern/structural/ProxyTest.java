/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPattern.structural;

import com.designPatterns.structural.proxy.FastThing;
import com.designPatterns.structural.proxy.Proxy;
import com.designPatterns.structural.proxy.SlowThing;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Roman
 */
public class ProxyTest {
    
    public ProxyTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testProxy() 
    {
        Proxy proxy = new Proxy();
        FastThing fastThing = new FastThing();

         Assert.assertEquals(fastThing.sayHello(),"FastThing");        
        
        proxy.sayHello();        
        Assert.assertEquals(proxy.sayHello(),"SlowThing");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
