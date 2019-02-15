package javaSession;

public class IfElseConcepts {
	
	public static void main(String[]args) {
		
		//main method is important to execute the program
		// if -  keyword (starts with small letter)
		// if and else always contains boolean conditions means true or false.
		// this is also called comparsion operator also.
		//  =   is assignment operator
		//  ==   is comparison operator
		
		
		
		int a=50;
		int b=300;
		
        if(b<a) {
        	
        	System.out.println("a is smaaler than b");
        }else {
        	
        	System.out.println("a is greater than b");
        	
        }
		
			//Comparison operator
            	//     <>  ,  >=   ,    <=,   ==      ,!=  
			
              int x=100;
              int y=100;
              
              
              if(x==y) {
            	  
            	  System.out.println("x and y both are equal");
            	  
            	  
              }else {
            	  
            	  System.out.println("both are different");
            	  
              }
        
        //Find the highest number
              int l=1000;
              int m=200;
              int k=300;
              int s=200;
            
              
           //nested if conditions   
              
            		  
              if(l>m &l>k ) {
            	  
            	  System.out.println("l is the greatest number");
            	  
           }else if(m>k & m>l){
            	  System.out.println("m is the greatest number");
            	  }
           else if(k>s & k>m){
        	   System.out.println("k is the greatest number");
           }
              
           else {
        	   
        	   System.out.println("s is the king");
        	   
        	   
           }
        
		}
		
		
		
		
	}
	
	


