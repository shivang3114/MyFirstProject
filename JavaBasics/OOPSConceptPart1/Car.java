package OOPSConceptPart1;

public class Car {
 
	
	//these are called global variables.before main method as defined that why these are GV.
	int mod;
	int wheel;
	
	
	
	public static void main(String[] args) {
		
    //new keyword is used to create object.
	//1.new Car()--this is the object of car class.
	//2. a,b,c are object refrence variable	
	//3. given each and every copy of each one of them representer.	
		
	Car a=new Car();
	Car b=new Car();
	Car c=new Car();
	
	a.mod=2015;
	a.wheel=4;
	
	b.mod=2016;
	b.wheel=5;
	
	c.mod=2017;
	c.wheel=6;

	System.out.println(a.mod);
	System.out.println(a.wheel);
	
	System.out.println(b.mod);
	System.out.println(b.wheel);
	
	System.out.println(c.mod);
	System.out.println(c.wheel);
	

	
	
		
	}

}
