import java.io.*;
public class lab25 {
public static void main(String arg[]) throws IOException{
	
	DataInputStream indata=new DataInputStream(System.in);
	String a,c;
	boolean b;
	System.out.println("Enter a String");
	a=indata.readLine();
	b=a.startsWith("b");
	System.out.println(b);
	
}
}
