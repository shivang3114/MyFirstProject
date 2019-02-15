package javaSession;

public class CallByRefrenceCallByValue {
    
	//these are global variables
	
	int i;
	int j;
	
	
	public static void main(String[]args) {
		
		
		CallByRefrenceCallByValue obj=new CallByRefrenceCallByValue ();
		
		int p=100;
		int q=200;
		
		obj.login(p,q);   //call by value or pass by value---we are passing the copy of arguments
		
		double x=100;
		double y=5;
		
		obj.divison(x, y);   //call by value
		
		//to access global varibale
		
		obj.i=33;
		obj.j=43;
		
		obj.swap(obj);
		
		System.out.println("the value of i is:"  +obj.i);
		System.out.println("the value of j is:" +obj.j);
		
	
	}
	public int login(int a,int b) {
		
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	public double divison(double r, double s) {
		
		double t=r/s;
		System.out.println(t);
		return t;
		
		
	}
	
	//CALL BY REFERNCE. 
	
	public void swap(CallByRefrenceCallByValue t) {
		
		int temp;
		temp=t.i;
		t.i=t.j;
		t.j=temp;
		
		
		
		
		
		
		
	}
	
}
