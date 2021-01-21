package com.revature.app;
import com.revature.mysecondsubpackage.Test;
import java.lang.Math;

public class CastingDriver {

	public static void main(String[] args) {
		/*
		 * Implicit casting example
		 */
		long myLong;
		int myInt = 1000;
		myLong = myInt; //myInt is being implicitly casted 
		System.out.println(myLong);
		
		double myDouble = 13.9999999;
		int myNewInt;
		myNewInt = (int) myDouble; // explicit cast 
		System.out.println(myNewInt);
		
		long myLong2 = 100;
		myLong2 = 1000000;
		byte myByte = (byte) myLong2;
		System.out.println(myByte);
		
		/*
		 * 
		 * 
		 * Reference type casting 
		 * 
		 * We have 
		 *  1. upcasting
		 *  2. downcasting
		 *  
		 *  Strings in Java are not primitives, they are objects 
		 *  so we can assign a string object to a String referecne variable
		 */
		String myStr = "Hello there";
		  int lenOfMyStr=myStr.length();
		/*
		 * an array of char values
		 * myStr is being referenced into the memory 
		 */
		char[] myCharArray = new char [lenOfMyStr];
		myCharArray = myStr.toCharArray();
		
		Object myObj = myStr;
		
		System.out.println(myObj);
		myObj = new Object();
		
		Object myNewObj = new Object();
		//Downcasting is unsafe
		
		String fearMyObj = (String)  myNewObj;
		System.out.println(fearMyObj);
		//why unsafe?
		myObj = new CastingDriver();
		String myStr3 = (String) myObj;
		
		System.out.println(myStr3);
	}
	

}
