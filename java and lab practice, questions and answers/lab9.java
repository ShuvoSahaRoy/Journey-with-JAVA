import java.util.Scanner;
public class lab9 {
	public static void main(String args[]){
		int a,i,j=0,s;
		double k=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		for(i=0;i<5;i++){
			s=a%10;
			a=a/10;
			s*=Math.pow(2,k);
			j+=s;
			k++;
		}System.out.println(j);
	}
}
