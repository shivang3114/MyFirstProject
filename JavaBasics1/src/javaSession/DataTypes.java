package javaSession;

public class DataTypes {

	
	public static void main(String[] args) {
		
		
		//primitive data types-----int,double,char,boolean
		//after declaration only java can print the values.Because without declaration java is unknown the data and variable.
		//Yellow lines is a warning---e.g you have declare a variable but not using consuming memory.
		//1.integer values
		int a=10;
		int b=20;
	    int c=-10;
		int d=0;
		int e=-300;
		
		System.out.println(a+e);
		System.out.println(b);
		System.out.println(c);
		
		//System= is a class
		//println()= is the method
		//CONSOLE=Output screen
		
		
		
		
		//2.double-to store floating values use double data type keyword.
		
		double f=-13.14;
		double g=20.314;
		double l=20;
		double m=-300;    //consider as 300.00
		double m1=100;   //consider as 100.00
			
		    //3.charcter---it should be single digit value and enclosed always in ''  single quotes
		
		char z='a';
		char w='d';
		char z1=  '1';
		char z2= '@';
		char z3='-';
//		char z4= //'+p';  //not allowed consider as two character 
		
		
		System.out.println(z  +w     +z1);
		
		
		
		//4.boolean
		//it will always return below values or either 0 or 1 also sometime.
		//Ques:true and false in value or keyword in JAVA?
		//ans:yes these are values but already avilable in java.
		  
		  boolean w0=true;
		  boolean w1=false;
		

		//5. String----is a class not a data type but we can use as as data type to store string values.
		  
		  String s="selenium";
		  String s1="my name is shivang";
		  
		  String s2= "1000";  //it is a string not integer value
		  
		  String s4="3.14";    //it is a string not integer value
		  
		  String s5="@@@@@@@";
		  
		  
	}
	
	
	
}
