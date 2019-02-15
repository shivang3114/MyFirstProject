package programms;

public class Swapping {
	
	int a;
	int b;
	int c;
	
	
	public static void main(String[] args)
	{
            
        Swapping obj=new Swapping();    	
	     obj.a=10;
	     obj.b=20;
	     
	     System.out.println("value of a is:");
	     
	     System.out.println("value of b is :" );
	     
	     
}
	
	public void swap(int a, int b, int c) {
		
		a=b;
		b=c;
	    c=a;
	    System.out.println("value of a is:" +a);
	     
	     System.out.println("value of b is :" +b);
		
		
	}
	
}