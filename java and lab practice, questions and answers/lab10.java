import java.util.Scanner;

public class lab10 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int n,i=1,k,j,te,g=0;
		int b[]=new int [100];
		int a[] = new int[100];
		System.out.println("Enter four digit integer: ");
		n = in.nextInt();
		
		while(n!=0)
	    {
			b[g++] = n;
	        j = n%10;
	        n/=10;
	        j=j+7;
	        j%=10;
	        a[i] =  j;
	        i++;
	    }
		System.out.print("\nEncryption set is: ");
	    for(k=0;k<i-1;k++)
	    {
	        te = a[1];
	        a[1] = a[3];
	        a[3] = te;

	        te = a[0];
	        a[0] = a[2];
	        a[2] = te;
	        System.out.print(a[k]);
	    }
	    System.out.print("\nDecryption set is: ");
	    for(k = i-1;k>0;k--){
			System.out.printf("%d", a[k]+3);
		}
	}
}
