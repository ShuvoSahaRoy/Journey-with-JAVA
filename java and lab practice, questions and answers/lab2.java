import java.util.Scanner;
class invoice{
	
	String partNumber;
	String description;
	int quantity;
	double priceperitem;
	 invoice(String P,String D,int Q,double I){
		partNumber=P;
		 description=D;
		  quantity=Q;
		priceperitem=I;
	}
	
	void get(){
		double amount=getInvoiceAmount();
		System.out.println("your total amount is: "+amount);
		
	}
	double getInvoiceAmount(){
	
		if(quantity<0)
			quantity=0;
		if(priceperitem<0)
			priceperitem=0;
		double price=priceperitem*quantity;
		return price;
	}
}
public class lab2 {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter part number: ");
		String P=in.nextLine();
		System.out.print("Enter parts description: ");
		String D=in.nextLine();
		System.out.print("Enter parts quantity: ");
		int Q=in.nextInt();
		System.out.print("Enter price of per Item: ");
		double I=in.nextDouble();
		
		invoice n=new invoice(P,D,Q,I);
	
		n.get();
	
	}
}
	
	