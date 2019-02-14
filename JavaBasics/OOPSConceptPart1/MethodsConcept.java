package OOPSConceptPart1;

public class MethodsConcept {
	
	//main method--> starting point of execution
//java complier first look the main method if inside the main method nothing is there it will come out.
	
	//main method is void--never returns a value.
	
	public static void main(String[] args) {
	
		MethodsConcept obj=new MethodsConcept();
		
      //to access non-static method need to create one opbject inside the main class with respect to the major class name	
     //one obj will be created,obj is the refrence variable,referring to this object.
     //after creating the object,the copy of all non-static methods will be given to this object.
		
		obj.test();
		
		double l=obj.sum();           // to store values defined variable with data type. and print in the next line
		System.out.println(l);
		
		int o=obj.divison(10, 5);   // to store values defined variable and print in the next line
		System.out.println(o);
		
		
		String m=obj.name();
		System.out.println(m);
		}
	
	
	
   //non static methods
	//return type=void
	public void test(){    //no input,no output
		
		System.out.println("this is the method");
		}
   
	//return type-double
	public double sum(){   //no input,some output
		
		System.out.println("this is the second method");
		double a=20.10;
		double b=12.34;
		double c=a+b;
	    return c;
	    
	}
	
      
	//return type-String
	
	public String name(){       //no input,some output
    	  
    	  System.out.println("this is the name method");
    	  String x="shivang";
    	  String y="14/11/1993";
    	  String z=x+y;
    	  return z;
    	  
      }
      //return type-integer
      //x,y -input parameters/arguments
      public int divison(int x, int y){         //give input,some output
    	  
    	  System.out.println("this is division method");
    	  
    	int w=x/y;
    	return w;
    	  
      }

}


