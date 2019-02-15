package conceptInterface.java;

public class HSBCBank implements USBank,BrazilBank{  // WE ARE ACHEVING MULTIPLE INHERITANCE this is also called is a relationship

	//intially it will give error because we need to follow rules of interface class.
       //It means we have to define all the methods in HSBCBank class which is avaialble in Interface class.
	
	//over-riding from USBANK
	
	
    public  void credit() { //over-ridden method
    	
    	
    	System.out.println("---credid data");
    }
	
	public void debit() {
		
		System.out.println("---debit data");
	}
	
	public void transfermoney() {
		
		System.out.println("---transfer money");
	}
	
	//WE HAVE OWN METHOD ALSO
	
	//SEPERATE METHOD OF HSBC BANK
	
	public void educationLoan() {
		
		System.out.println("-----car loan");
		
		
	}
	
	public void lessInterest() {
		
		System.out.println("-----low interest");
	}
	
	//OVER-RIDE FROM BRAZIL
	
	public void mutualfund() {
		
		System.out.println("---this is multiple interface inherit concept");
		
		
	}
}
