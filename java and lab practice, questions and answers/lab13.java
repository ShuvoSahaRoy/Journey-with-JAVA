class Complex{
	double real1;
	double img1;
	double real2;
	double img2;
	
	Complex(double a,double b,double c,double d)
	{
		real1=a;
		img1=b;
		real2=c;
		img2=d;
	}
	void add()
	{
		double realadd,imgadd;
		realadd=real1+real2;
		imgadd=img1+img2;
		System.out.println("The Add of the two complex number is: "+realadd+"+"+imgadd+"i");
	}
	void subtract()
	{
		double realsub,imgsub;
		realsub=real1-real2;
		imgsub=img1-img2;
		System.out.println("The Subtract of the two complex number is: "+realsub+"+"+imgsub+"i");
	}
	
}
public class lab13 {
public static void main(String args[])
{
	Complex ob1=new Complex(12.34,34.23,34.56,56.67);
	
	ob1.add();
	ob1.subtract();
}
}
