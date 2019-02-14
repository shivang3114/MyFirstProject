package OOPSConceptPart1;

public class LocalVsGlobalVariable {
    
	//Global variables
	
	String name="shivang";
	int age=25;
	
//how to access global variables: need to create object with respect to the class name inside the main method.	
	
	public static void main(String[] args) {
		
		//local variable access with in the main method
		int i=05; 
		double d=3.14;
		
		LocalVsGlobalVariable obj=new LocalVsGlobalVariable();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}
       public void test(){
    	  
    	   //these are local varible access within the method.
    	   
    	   String name="sanju";
    	   double height= 5.11;
    	 //how to access local variable
    	  System.out.println(name); 
    	   
    	   
       }
}
