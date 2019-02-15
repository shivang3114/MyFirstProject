package javaSession;

public class StringConcatenation {

	
	
	public static void main(String[]args) {
		
		//execution always starts from left to right.
		//+ : is concatenation operator.
		//println- is used to print on the console with a new line
		//print-  is used to print on the console.
		
		
		
		
		int a=100;
		int b=200;
		
		String x="hello";
		String y="world";
		
		double d=10.10;
		double e=20.10;
		
		
		
		System.out.println("1"   +a+b);
		System.out.println("2"  +x+y);
		System.out.println("3"   +a+b+x+y);
		
		System.out.println("4"   +x+y+a+b);  //it wont add the numbers
		
		System.out.println("5"     +x+y+(a+b));  //this will add numbers
		
		System.out.println( "6"         +x+a+b+y);
		
		System.out.println(  "7"     +(x+y)+b+a);
		
		System.out.println( "8"      +(a+b)+(x+y));
		
		System.out.println( "9"        +(a+b)+y+x);
		
		System.out.println(  "10"       +a+b+a+b+x+a+y+x+y+b+x+y+(a+b+x+y+b+a));
		
		//600hello100worldhelloworld200helloworld300helloworld200100
		
		
		System.out.println("the sume of d and e is:"  +(d+e));
		System.out.println("the sume of integer and double value is:"   +(a+b+d+e));
		System.out.println("the sum of string and double value is:"   +(x+d+y+e));
		
		
		System.out.println("shivang");
		System.out.print("selenium");
		System.out.println("java");
		System.out.print("hello i am kishan");
		System.out.print("hiiiii");
		
		
		
		
		
		
		
	}
}
