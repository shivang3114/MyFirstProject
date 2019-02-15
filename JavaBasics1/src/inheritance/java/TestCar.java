package inheritance.java;

public class TestCar {

	
	
	public static void main(String[]args) {
	
	//call the car and bmw class
	//as these are non-static methods we can call with refrence to the object
		//this method is available in parent and child class both in this condition jvm will give preference for the child class always because it says
		  // you have your own method dont inherit this class and it will execute your own class.No need to over-riddden this class	
		
		
		//Polymorphism--one to many
		//static polymorphism----compile time polymorphism
		
		//Why complie time polymorphism?
		 //Ans-At the time of compilation java will decide which mehod I need to call
		
		BMW obj= new BMW();
		
		obj.start(); //OVER-RIDDEN METHOD     
		obj.start();
		obj.stop();           //parent class method
		
		obj.Speed();          //child class method
	    obj.automaticGear();
	    
	    obj.fourwheels();
	    
	    
	    
	    System.out.println("************8");
	    
	    Car c=new Car();
	    c.start();
	    c.stop();
	    
	    //can I access BMW class methods? No---bcz parent can't access child class properites.
	    
	    //Top Casting
	    
	    Car c1=new BMW();  //child class object can be referred by parent class refrence variable---dynamic polymorphism/ run time polymorphism
	    
	    c1.start();
	    c1.stop();
	    
	    //over-riddden methods and parent class methods only and only can access with run time polymorphism/ dynamic polymorphism
	    
	    //Down Casting
	       
	          BMW obj1=(BMW) new Car();    
	    //it will give "ClassCastException
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
	
}	
	

