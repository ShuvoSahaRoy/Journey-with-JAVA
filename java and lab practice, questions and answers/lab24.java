import java.io.*;
public class lab24 {
public static void main(String arg[]) throws IOException{
	DataInputStream indata=new DataInputStream(System.in);
System.out.println("Enter a String");
	String name=indata.readLine();
	System.out.println("Value is "+name);
	System.out.println("Which you want to find");
	String name1=indata.readLine();
	System.out.println("Searching "+name1);
	int i=name.indexOf(name1);
	System.out.println("Position of "+name1+" of "+name+"is at "+i);
}
}
