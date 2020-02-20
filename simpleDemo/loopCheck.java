package practise;

import java.util.Scanner;

public class loopCheck {
    public static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        System.out.println(num);
    for(int j=0; j<num;j++)
    {
       System.out.printf("%d\n",j);
    }
}
}
    
