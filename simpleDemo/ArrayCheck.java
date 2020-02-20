package practise;

import java.util.Scanner;

public class ArrayCheck {
	public static Scanner in;

	public static void main(String[] args) {
		int[] number;
		number = new int[5];
		in = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			number[i] = in.nextInt();
			System.out.println(number[i]);
		}
	}
}
