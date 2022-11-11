import java.util.Scanner;

public class lab5 {
	public static void main(String args[]){
		int accountNumber;
		int beggeningBalance;
		int charge;
		int Credit;
		int CredLimit;
		Scanner in = new Scanner(System.in);
		
		System.out.println("account number: ");
		accountNumber = in.nextInt();
		System.out.println("Enter balance at the beginning of the month");
		beggeningBalance = in.nextInt();
		System.out.println("Enter total of all items chargCed by the customer this month");
		charge = in.nextInt();
		System.out.println("Enter total of all credits applied to the customer’s account this month");
		Credit = in.nextInt();
		System.out.println("Enter allowed Credit limit.");
		CredLimit = in.nextInt();
		
		int newBalance = (beggeningBalance+charge-Credit);
		System.out.println(newBalance);
		if(newBalance>CredLimit){
			System.out.println("Credit limit exceeded");
		}
		
	}

}
