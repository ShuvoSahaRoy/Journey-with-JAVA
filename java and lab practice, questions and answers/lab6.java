import java.util.Scanner;
public class lab6 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Calculating for 7 days or one weak");
		  int k=0;
			int	a[]=new int[7];
			System.out.println("Enter the number of items have been sold per day:");
		 for(int i=0;i<7;i++)
		 {
			 System.out.printf("\t");
		     a[i]=in.nextInt();
		 }
		 float sum=0,income;
		 int b[]=new int[1000];
		 System.out.println("Enter  the prices of sold items:");
		 for(int i=0;i<7;i++)
		 {
		 for(int j=1;j<=a[i];j++)
		 {
			 System.out.printf("\t");
		   b[k]=in.nextInt();
		     k++;
		 }
		 }
		 k=k-1;
		 for(int i=0;i<=k;i++)
		 sum+=(b[i]*0.09);
		 income=(200+(7*sum));
		 System.out.printf("Per week a salesman earns:"+income+" taka");
	}

}
