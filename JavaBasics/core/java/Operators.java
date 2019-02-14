package core.java;

public class Operators {

	public static void main(String[]args){
		
		int number=10;
		while(number<=20){
			
			System.out.println(number);
			number=number+1;
			}
		
		System.out.println("this is the table of two");
		
		
		for(int no=2; no<=20; no=no+2){
			
			System.out.println(no);
			
			
		}
		
		System.out.println("this is the table of 3");
		
		for(int table3=3; table3<=30;  table3=table3+3 ){
			
			System.out.println(table3);
			}
		System.out.println("this is the reverse number:");
		
		for(int reverse=30; reverse>=3;  reverse=reverse-3){
			
			System.out.println(reverse);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		//post increment
		
		int a=10;
		int b=a++;
	    
	     //post decrement	
		int x=2;
	    int y=x--;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("this is the value of y:" +y);
		System.out.println("this is the value of x:"   +x);
		
		
		int z=10;
		int w=z++;
		
		System.out.println("the value of a and w is:"   +(z)+(w));
		
		//pre increment
		int l=12;
		int m=++l;
		
		System.out.println("value of m:"  +m);
		System.out.println("value of l:"    +l);
		 
		//pre decrement
		
		int p=10;
		int q=--p;
		System.out.println("value of q:"  +q);
		System.out.println("value of p:"  +p);
	}
	
	
	 
}
