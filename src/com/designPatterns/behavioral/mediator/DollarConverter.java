/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designPatterns.behavioral.mediator;

/**
 *
 * @author Roman
 */
public class DollarConverter {
    
   Mediator mediator;

	public static final float DOLLAR_UNIT = 1.0f;
	public static final float EURO_UNIT = 0.7f;
	public static final float KRONA_UNIT = 8.0f;

	public DollarConverter(Mediator mediator) {
		this.mediator = mediator;
		mediator.registerDollarConverter(this);
	}

	private float convertEurosToDollars(float euros) {
		float dollars = euros * (DOLLAR_UNIT / EURO_UNIT);
		System.out.println("Converting " + euros + " euros to " + dollars + " dollars");
		return dollars;
	}

	private float convertKronorToDollars(float kronor) {
		float dollars = kronor * (DOLLAR_UNIT / KRONA_UNIT);
		System.out.println("Converting " + kronor + " kronor to " + dollars + " dollars");
		return dollars;
	}

	public float convertCurrencyToDollars(float amount, String unitOfCurrency) {
		if ("krona".equalsIgnoreCase(unitOfCurrency)) {
			return convertKronorToDollars(amount);
		} else {
			return convertEurosToDollars(amount);
		}
	}
    
}
