import java.util.Scanner;
public class lab7 {
public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	int n,max;
	int a[] = new int[100];
    
    System.out.print("enter the digit number: ");
  n=in.nextInt();
    for(int j=0;j<n;j++)
    {
        a[j]=in.nextInt();
    }
max=a[0];

for(int i=1;i<n;i++)
{
    if(a[i]>max)
    max=a[i];
   
}
System.out.println("miximum number is: "+max);

}
}
