package practise;
import java.util.Scanner;
public class LOOP_If {
	
	public static Scanner in;
	
	public static void main(String[] args) {
	int a;
	in = new Scanner (System.in);
	a= in.nextInt();
	for(int i=1; i<a;i++){
		if(i%2 == 0)
			System.out.printf("%d\n",i);
		
	}
	}

}
