package core.java;

public class MultiDimensionalArray {

	public static void main(String[]args){
		
		String a[][]=new String[3][4];
	//	[][]a---both are same this is also correct
		
		System.out.println(a.length);  //this will give row length
		System.out.println(a[1].length);  //this will give column length bcz this size depends on rows and each and every rows contains same columns
		
		//1st Row
		a[0][0]="A";
		a[0][1]="B";
		a[0][2]="c";
		a[0][3]="d";
		
		//2nd ROW
		a[1][0]="e";
		a[1][1]="f";
		a[1][2]="g";
		a[1][3]="h";
		
		//3Rrd Row
		a[2][0]="g";
		a[2][1]="h";
		a[2][2]="I";
		a[2][3]="J";
		
		System.out.println(a[1][1]);
		//System.out.println(a[0][3]);
		System.out.println(a[2][3]);
		
		
		//print all the values of 2d aRRAY: Use 2 for loops--one for row and other one for rows
		//row=0,col=0 to 4
		//row=1,col=0 to 4
		//row=2,col=0 to 4
		
		
		for(int row=0; row<a.length; row++){
		 
			for(int column=0; column<a[1].length; column++){
				
				System.out.println(a[row][column]);
			}
			
	
		
		
		
		
	}
	
	}
	
	
	
	
}
