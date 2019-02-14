package OOPSConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		

		//data conversion
		
		String x="100"; //this is not a integer 
		//how to convert into integer that is called data conversion
		System.out.println(x+20);
		
		int y=Integer.parseInt(x);
		System.out.println(y+20);
	
     //wrapper classes---integer,double,string,char,boolean
		
	//String to double conversion
		String a="12.33";
		double d=Double.parseDouble(a);
		System.out.println(d);
		
	//String to boolean conversion
		String b="true";
		boolean w=Boolean.parseBoolean(b);
		System.out.println(w);
	
		
		//Integer to string conversion
		 int qk=100;
		 System.out.println(qk+20);
		
		 String ss=String.valueOf(qk);
		 System.out.println(ss+30);
		 
		
	
	
	}
	
	

}
