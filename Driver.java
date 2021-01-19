//Naming convetion of classes: have every single first letter caps
//DriversCodes,HelloWorld
public class Driver {
	public static void main(String[] args){
		/*
		 *Declartation is where you actaully declare a partiacal variable
Initialization: where you assign some valule to the varabile for the first time
		 *
		 */
		byte myByte; //declartaive
		myByte= 10;  //intiailization 

		byte mySecondByte = 20; //Declaratiive and intitlaiization ont the smae line
		System.out.println("myByte: " + myByte);

		System.out.println("mySecondByte: "+ mySecondByte);

		myByte= 30;

		System.out.println("myByte:" + myByte);

		short myShort = 25_767;
		int myInt = 1_000_000_547;
		long myLong = 4_424_324_318L;
		long mySecondLong = 1_000_000; //Implicitiy carst form int to long		
		System.out.println("myShort: " + myShort);

		char c =1000;
		float myFloat = 3.141595f;
		double myDounle = 41.464;

		System.out.println(myFloat);
		System.out.println(myDounle);
		// char type
		//
		c= 'A';
		System.out.println(c);

		// Boolean Type 
		boolean b,d =true,false;
		System.out.println(b);
		b = false;
		System.out.println(d);

		//Naming conventions of variables ..
		//don' do the really ambigous name like a, b. or c
		//Have something descripitve 
		//and do camelCase, have the first word's letters in lowercarse, and any subsequent first letters of a word in uppercase
		//numOfTires, numOfAnimales
		//
		//strings are not primitives, they are actaully objects. Therefore there is a String class

	}
}


