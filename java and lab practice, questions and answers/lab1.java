import java.util.Scanner;
public class lab1 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int n,i,j,k=0;
		int a[] = new int[100];
		n = in.nextInt();
		while(n!=0){
			i = n%10;
			n=n/10;
			a[k] = i;
			k++;
		}
		for(j=k-1;j>=0;j--){
			System.out.print(a[j]+ "   ");
		}
	}
}
