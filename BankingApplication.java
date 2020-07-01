import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		BankAccount obj1 = new BankAccount("Muhammad Mehran", "001");
		BankAccount obj2 = new BankAccount("Mohammad Usman", "002");
		
		obj1.ShowMenu();
		obj2.ShowMenu();
		
		
			
			
		}
	}

class BankAccount{

String CustomerName;

String CustomerId;

int Balance;

int PreviousTransaction;

BankAccount(String cname, String cid){
	
	CustomerName = cname;
	CustomerId  = cid;

}

void Deposit (int amount) {
	
	if(amount != 0) {
		
		Balance = Balance + amount;
		PreviousTransaction = amount;
	}
	
	
}

void Withdraw(int amount) {
	
	if(amount != 0) {
		
		Balance = Balance - amount;
		PreviousTransaction = -amount;
	}
	
	
	

}

void getPreviousTransaction() {
	
	if(PreviousTransaction > 0) {
		
	  System.out.println("Deposited : " +PreviousTransaction);
	}
	
	else if(PreviousTransaction < 0) {
		
		System.out.println("WithDrawn : " +Math.abs(PreviousTransaction));
		
	}
	
	else
	{
		System.out.println("No Transaction Occured!");
	}
	
}
/*void Exit() {
	
	System.out.println("ThankYou For Using Our Servicess.."); 
}
*/

void ShowMenu() {
	
	char option = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Welcome : "+CustomerName);
	System.out.println("Your Id is : "+CustomerId);
	System.out.println("\n");
	System.out.println("A. Check Balance");
	System.out.println("B. Deposite");
	System.out.println("C. Withdraw");
	System.out.println("D. PreviousTransaction");
	System.out.println("E. Exit");
	System.out.println("\n");
	
	do 
	{
		System.out.println("************************************************");
		System.out.println("Enter an option : ");
		System.out.println("************************************************");
		
		option = scanner.next().charAt(0);
		
		System.out.println("\n");
		
		switch (option){
		
		case 'A' :
			System.out.println("<------------------------------>");
			System.out.println("Balance = "+Balance);
			System.out.println("<------------------------------>");
			System.out.println("\n");
			break;
			
			
		case 'B' :
			System.out.println("<------------------------------>");
			System.out.println("Enter an amount to Deposite : ");
			System.out.println("<------------------------------>");
			int amount = scanner.nextInt();
			Deposit(amount);
			System.out.println("\n");
			break;
			
		case 'C' :
			System.out.println("<------------------------------>");
			System.out.println("Enter an amount to Withdraw : ");
			System.out.println("<------------------------------>");
			int amount2 = scanner.nextInt();
			Withdraw (amount2);
			System.out.println("\n");
			break;
			
		case 'D' :
			
			System.out.println("<------------------------------>");
			getPreviousTransaction();
			System.out.println("<------------------------------>");
			System.out.println("\n");
			break;
			
		case 'E' :
			
			System.out.println("<------------------------------>");
			//Exit();
			break;
			
			
		default :
			
			System.out.println("invalid Option!\n Try Again..");
			
		}
	}
		
		while(option != 'E');
		
			
			System.out.println("Thankyou For Using Our Services..");
			System.out.println("<------------------------------>");
}

}