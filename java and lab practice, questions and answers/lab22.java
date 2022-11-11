import java.io.*;
import java.util.Scanner;

public class lab22 {
public static void main(String arg[]) throws IOException{
	
	DataInputStream indata=new DataInputStream(System.in);
	System.out.println("Enter the value of 1st String");
	String Str1=indata.readLine();
	System.out.println("Enter the value of second String");
	String Str2=indata.readLine();
	
	System.out.println("Enter the value of 1st string startIndex");
	int a=indata.readInt();
	System.out.println("Enter the value of 2st string startIndex");
	int c=indata.readInt();
	System.out.println("Enter the value of length");
	int d=indata.readInt();
	
	
	boolean b=Str1.regionMatches(a, Str2,c, d);
	System.out.println("Return value is: "+b);
	
	
	
}
}
