package OOPSConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		//Can we overload mainMethod--yes
		MethodOverloading obj=new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(12.21,12.31);
		
	   
   }
    	 
   public static void main(int p){
	   
   }
   public static void main(int q,int a){
	   
   }
    	 
   //MethodOverloading:when method name is same with different arguments or input parameters within the same class.
   //.duplicates method are not allowed---same name ,zero parameter(same method name with same number of argument is not allowed)
   //2.Methods can't create method inside the same methods 	
	
   public void sum(){
		System.out.println("this is method overlaoding");
	}
	public void sum(int a){
		System.out.println(a);
		
	}
	public void sum(int a,int b){
		
	}
	public void sum(double x,double y){
		
		System.out.println(x);
		System.out.println(y);
			
	}
	public void sum(String z){
    
	}
    public void sum(String w,String x){
    	
    }
}
