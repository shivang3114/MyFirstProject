package OOPSConceptPart1;

public class Bsup extends ASupr {

//Purpose-it is used to call parent class constructor.	
//super keyword always the first statement of the constructor.
// Inside the constructor we cannot write two constructors.
// super keyword is used to call paramatrize constructor of parent class	
	
    public Bsup(){
    	
    	System.out.println("this is default");
    	
    }


       public Bsup(int i){
    	   super(10);
    	 System.out.println("this is one para... constructor.");
    	
    	 
       }
	
     public Bsup(int i,int j){
    	 
    	 super(100,200);
    	 
    	 
    	 System.out.println("this is 2 argument overlaoded constructor");
    	 
    	 
     }
     
     
 public static void main(String[]args){
    	 
    	 
    	 Bsup obj=new Bsup();
    	 
    	 Bsup obj1=new Bsup(10);
    	 
    	 Bsup obj2=new Bsup(100,200);
    	 
     }
     
     
     
     
     
}

