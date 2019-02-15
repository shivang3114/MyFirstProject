package conceptInterface.java;

public class TestBank {
	
	public static void main(String[] args) {
		
//if a class is implementing any interface,then its mandatory to define/over-ride all the methods of Interface 		
		//USBank obj= new USBank();  //we cannot create object of the interface class
		
		//compile time polymorphism----static polymorphism
		
		
		System.out.println(USBank.main_bal);
		
		HSBCBank obj=new HSBCBank();
		obj.credit();                     //over-ridden method
		obj.debit();                     //over-ridden method
		obj.educationLoan();
		obj.lessInterest();
		obj.transfermoney();
		
		obj.mutualfund();
		
		System.out.println(BrazilBank.z);
		
		
		
		//dynamic polymorphism---Run time polymorphism
		
	//child class object can be referred a parent Interface refrence variable
		
              USBank b=new HSBCBank();		
	          b.credit();
	          b.debit();
	          b.transfermoney();
	  //it can access only over-ridden methods .        
	          
	          
		}
	
	

}
