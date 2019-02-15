package TestPackage.jave;

public class FinallyConcept {

	public static void main(String[] args) {
		
		
		//test1();
		//test2();
		    div();
		    
		    div1();
	}
      public static void test1() {
	
	try {
		System.out.println("---inside test1 method");
		
		throw new RuntimeException("test");
		
	}catch(Exception e) {
		
		System.out.println("---inside the catch");
		}
	
	
	finally
	{
		System.out.println("--insode the finally");
	}
	
    	  
	System.out.println("----test1");
}
      public static void test2() {
    	  
    	  try {
    		  
    		  System.out.println("-----inside the try block");
    	  }
    	  finally
    	  {
    		  
    		  System.out.println("----finally inside the test2");
    		  
    	  }
    	  
    	 
    	  
            }
    
    
    //real time exception example
	  
      public static void div(){
	
	int a=10;
	try {
		
		System.out.println("---inside the try block");
		
		int b=a/0;
		}
	catch(ArithmeticException e) {
		
		System.out.println("inside the catch block");
		}
      finally
      {
      	System.out.println("--this is the airthmetic erro");
    
    }
      
      }
    
      
      public static void div1(){
    		
    		int a=10;
    		try {
    			
    			System.out.println("---inside the try block");
    			
    			int b=a/0;
    			}
    		catch(NullPointerException e) {
    			
    			System.out.println("inside the catch block");
    			}
    	      finally
    	      {
    	      	System.out.println("--this is the airthmetic erro");
      
}
      
      }
}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
