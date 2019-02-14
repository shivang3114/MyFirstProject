package OOPSConceptPart1;

public class ConstructorWiththisKeyword {

	
	int a;
	String b;
	
	
	
	//duplicate constructors are not allowed.
	  //overlaoded constructor
	
	public ConstructorWiththisKeyword(){  //defalut constructor
	
		System.out.println("this is default");
		
	}
	
	public ConstructorWiththisKeyword(int a,String b){  //paramatrize constructor
		
		this.a=a;
		this.b= b;
		
		System.out.println(a);
		System.out.println(b);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
        
		ConstructorWiththisKeyword obj=new ConstructorWiththisKeyword();
		
		ConstructorWiththisKeyword obj1=new ConstructorWiththisKeyword(2,"selenium");
		
		
	}

}
