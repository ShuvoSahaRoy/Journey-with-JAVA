package practise;
import java.util.Scanner;

public class simple_operation {
	public static Scanner in;
	public static void main(String args[]){
		
		int a=5,b=5,c;
		in = new Scanner(System.in);
		c= in.nextInt();
		System.out.printf("%d\n",a+b);
		System.out.printf("%d\n %d\n%d\n",(a+b)*c,c,c%10);
	}

}
