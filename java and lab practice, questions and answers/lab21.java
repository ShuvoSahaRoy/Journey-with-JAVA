import java.io.DataInputStream;
import java.io.IOException;


public class lab21 {
@SuppressWarnings("deprecation")
public static void main(String arg[]) throws IOException{
	DataInputStream indata=new DataInputStream(System.in);
	String String1,String2;
	System.out.println("Enter first String");
	String1=indata.readLine();
	System.out.println("First String is" +String1);
	System.out.println("Enter second String");
	String2=indata.readLine();
	System.out.println("Second String is "+String2);
	int i=String1.compareTo(String2);
	if(i==0){
		System.out.println(String1+" "+String2+" are equal");
		
	}
	else if(i>0){
		System.out.println(String1+" is "+" greater than "+String2);
		
	}
	else if(i<0){
		System.out.println(String1+" is less than "+String2);
		
		
	}
	
}
}
