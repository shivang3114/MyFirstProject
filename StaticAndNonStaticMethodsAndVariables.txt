package OOPSConceptPart1;

     

public class StaticAndNonStatic {

//scope of global varibale will be available across all the functions with some conditions (static or non-static)	
	String name="shivang";    //non static global variable
	static int age=25;         //static global variable
	
	
	
	
	public static void main(String[] args) {
   
     //how to call static methods?
       //1.calling directly
		sum();
        //calling by classname		
		   StaticAndNonStatic.sum();	
		
	      //how to call static variables---call directly
		
		 System.out.println(age);
		 System.out.println(StaticAndNonStatic.age);
		 
		 
		 
		
      //can I access static methods by using object refrence?--yes we can access but this is not a good practise.
		 //warning will be given
	}
   public void sendmail(){
	   
	   System.out.println("this is non-static method");
   }
   
   public static void sum(){
	   
	   System.out.println("this is static method");
   }
   
}
