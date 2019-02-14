package OOPSConceptPart1;

public class ConstructorConcept {
	
	//no void--no static--bcz it is  not a function.
	//this is called default constructor--means zero parameters.
	
	//ques:Can we overload a constructor?
	//Ans: Yes we can overload a constructor.

	
	//these are overloaded constructor 
	
	public ConstructorConcept(){  //zero parameters
		
		System.out.println("this is defalut constructor");
		
	}
	   
	   public ConstructorConcept(int i){
		   
		   System.out.println("this is single paramater constructor");
		   
	   }
	   
	   public ConstructorConcept(int i, int j){
		   
		   System.out.println("this is two paramatrize constructor");  
		   
		   
	   }
	   
	   
        public static void main(String[] args) {
		
        //how to call a constructor
        	//calling default constructor
       ConstructorConcept obj=new ConstructorConcept();
       
       ConstructorConcept obj1=new  ConstructorConcept(10);
       
       ConstructorConcept obj2=new ConstructorConcept(20,30);
       
       
      
        	
        	
        	

	}

}
