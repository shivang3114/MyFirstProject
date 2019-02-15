package conceptInterface.java;

public interface USBank {

	//there is no main method in interface
	//interface keyword to define interface.
	//we dont give method body only method name.
	
	
	int main_bal=100;
	
	public  void credit();
	
	public void debit();
	
	public void transfermoney();
	
	//1.only method declaration
	//2.no method body- only method prototype
	//3.in interface, we can declare variables,vars are by default static in nature
	//4.varaible value cannot be changed
	//5.No static method in interface.-- WHY?
	//6.Inerfaces are part of OOP language & its part of objects and objects cannot have static methods thats why we never write static methods.
	//7No main method in interface.
	//8.We can not create the objects of interface	
	//9.Interface is Abstract in nature.
	
	
	
	 
	
}
