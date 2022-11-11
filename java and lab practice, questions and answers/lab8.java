import java.util.Scanner;
public class lab8 {
	
		public static void main(String args[]){
			
	Scanner in = new Scanner(System.in);
	int n,i,k=0,count=0;
	n = in.nextInt();
	int value=n;
	while(n!=0){
		i = n%10;
		n/=10;
		count++;
		k = k*10+i;
	}
	if(count>5){
		System.out.println("Error !!");
	}
	else if(value==k){
		System.out.println("Palindrome.\n");
	}
	else{
		System.out.println("Not palindrome.\n");
	}
}

}
