/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.iterator;

/**
 *
 * @author Roman
 */
public class BookCollection {
    
    private String titles[] = {"Rafiq","Fiki","Chicken","Imo"};

	public IIterator createIterator()
	{
		BookIterator result = new BookIterator();
		return result;
	}


	private class BookIterator implements IIterator
	{
		private int position;

                //@Override
		public boolean hasNext()
		{
			if (position < titles.length)
				return true;
			else
				return false;
		}
                //@Override
		public Object next()
		{
			if (this.hasNext())
				return titles[position++];
			else
				return null;
		}
	}
    
}
