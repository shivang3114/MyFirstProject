package core.java;



public class ArrayConcept {

	public static void main(String[]args){
	
		
	//one dimensional array	
	//array is used to store similar data types values in one variable
	//lowest bound/index=0
	//upper bound/index=n-1(n is the size of array)
		
	//disadvantage of array:
     //1. size is fixed--static array----to overcome this problem we use collection---Arraylist, HashTable---these things are called  dynamic array.
	 //2.it stores only similar data types  (e.g int,etc)--to overcome this problem,we use Object array,
		
		
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		
		System.out.println(i[2]);
		System.out.println(i[0]);
		
		//System.out.println(i[4]);    "ArrayIndexOutOfBoundsException:
		
		//size of the array
		System.out.println("sixe of the array is:" +i.length);
		
		//to print all values of array  always use looping concepts.
		
		for (int j=0;  j<i.length;  j++){
			
			
			System.out.println(i[j]);
		}
		
		//double
		
		double d[]=new double[3];
		d[0]=3.14;
		d[2]=2.14;
		d[1]=1.14;
		
		System.out.println(d[2]);
		System.out.println(d[1]);
		System.out.println("size of floating array is :"  +d.length);
		
		for(int l=0;  l<d.length;  l++){
			
		System.out.println(d[l]);
		}
		
		//char
		
		char c[]=new char[5];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		c[3]='@';
		c[4]='$';
		
		System.out.println("lenght of char size array is:"  +c.length);
		
		for (char m=0;  m<c.length;  m++){
			
			System.out.println(c[m]);
		}
		
		
      //string array		and boolean array we can create same like that.
		
		
		//Object array: (Object is a class-it is the most super class in Java)
		//this is used to store mulitple type of data types.
		Object obj[]=new Object[6];
		
		obj[0]=10;
		obj[1]=3.124;
		obj[2]="harry";
		obj[3]='a';
		obj[4]='@';
		//obj[5]=14/11/1993;
		System.out.println(obj.length);
		
		System.out.println(obj[3]);
		
		for(int x=0;  x<obj.length; x++){
			
			
			System.out.println(obj[x]);
		}
		
		
		
		
	}
	
	
}
