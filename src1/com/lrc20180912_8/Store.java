package com.lrc20180912_8;
class Store{
	public static Animal get( String choice ) { 
		if ( choice.equalsIgnoreCase( "dog" )) { 
			return new Dog(); 
		} else if ( choice.equalsIgnoreCase( "pig" )) { 
			return new Pig(); 
		} else
			return new Cat(); 
	} 
}