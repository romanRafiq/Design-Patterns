/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.designPatterns.behavioral.iterator.BookCollection;
import com.designPatterns.behavioral.iterator.IContainer;
import com.designPatterns.behavioral.iterator.IIterator;
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
public class IteratorTest {
    
    public IteratorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testIterator() 
    {
        BookCollection options = new BookCollection();
        
          
        int counter= 0;
        // using iterators for a collection of String objects:
        // using in a for loop        
        for (IIterator it = options.createIterator(); it.hasNext(); ) 
        {
            String name = (String)it.next();
            System.out.println(name);
            if(counter ==0)
            {
                Assert.assertEquals(name,"Rafiq");
            }
            else if(counter ==1)
                {
                     Assert.assertEquals(name,"Fiki");
                }
            else if(counter ==2)
                {
                     Assert.assertEquals(name,"Chicken");
                }
            else if(counter ==3)
                {
                     Assert.assertEquals(name,"Imo");
                }
                            
            counter++;
            
        }
        
      /*  // using in while loop
        IIterator name = options.createIterator();
        while (name.hasNext() )
        {
            System.out.println(name.next() );
        }*/

        
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
