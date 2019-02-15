package javaSession;

public class LoopsConcepts {

	public static void main(String[]args) {
		
		
		//while loop
		//disadvantage of while loop---it will generate infinite loop if we dont give incremental or decremental part
		
         int arr[]= {2,4,10,800};
         
         int i=0;   //initilization
         while(i<4) //condition
         {
        	 
        	 System.out.println(arr[i]);
        	 i=i+1;                     //incremental or decremental part
        	 }
		
		System.out.println("********************");
		
		
		//for loop
		
		//j++  =j+1
		// 
		
		for(int j=1; j<=10; j++) {          //intilization, Conditional,  incremanetal or decremental
			
			System.out.println(j);
			
			
		}
		
		System.out.println("************");
		
		//print 10 to 1
		// k means  k=k-1
		//10 9 8 7 6 5 4 3 2 1
		
		
		for (int k=10; k>=1; k--) {
			
			
			System.out.println(k);
		}
		
		
		
		//print 10 to 0
		
		for (int l=10; l>=0; l--) {  ////intilization, Conditional, decremental
			
			
			System.out.println(l);
		}
	}
	
	
	
}
