package lab_practise;

import java.util.Scanner;
public class problemOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// initialize variables
		int num;	// user input
		
		System.out.print("Enter a number with five digits: ");	// prompt
		num = input.nextInt();	// read five digits input
		
		// ensure input number with five digits
		if ( (num >= 10000) && (num <= 99999) )
		{
		System.out.printf("%d   ", (num / 10000));
		System.out.printf("%d   ", (num / 1000) % 10);
		System.out.printf("%d   ", (num / 100) % 10);
		System.out.printf("%d   ", (num % 100) / 10);
		System.out.printf("%d   ", (num % 10));
		}
		
		// if entered number more than five digits
		if (num > 99999)
			System.out.println("You had entered a number more than five digits.");
		
		// if entered number less than five digits
		if (num <= 9999)
			System.out.println("You had entered a number less than five digits.");

		
	}

}
