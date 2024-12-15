public class Typeconversion {
    public static void main(String args[]) {
       
        //1>widening or automatic type conversion /Implicit Type conversion

		int myNumber= 100;

		// Automatic type conversion

		// Integer to long type
		long myLong  = myNumber;

		// Automatic type conversion

		// long to float type
		
		float myFloat = myLong;

		
		System.out.println("Int value: " + myNumber);
		System.out.println("Long value: " + myLong);
		System.out.println("Float value: " + myFloat);


        //2>Narrowing or Explicit Conversion
     
	
		// Double datatype
		double myDouble = 100.04;
        //Double datatype to Integer Datatype
        int myInteger = (int)myDouble; //explicitly conversion done here
        System.out.println("My Double Value: " + myDouble);
        System.out.println("My Integer Value: " + myInteger);

		
	}
}


	