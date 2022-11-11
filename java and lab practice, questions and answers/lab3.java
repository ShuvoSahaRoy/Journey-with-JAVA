import java.util.Scanner;

	class Employee{
		String first_name;
		String last_name;
		double monthly_salary;
		
		Employee(String F, String L, double M){
			first_name = F;
			last_name = L;
			monthly_salary = M;
		}
		double get(){
			if(monthly_salary<0)
				return 0;
			else
				return monthly_salary*12;
		}
		double set(){
			if(monthly_salary<0)
				return 0;
			else
				return 12*(monthly_salary+(monthly_salary*.10));
		}
	}

	public class lab3 {
		public static void main(String args[]){
			Scanner in=new Scanner(System.in);
			double p= in.nextDouble();
			Employee ob = new Employee("Sayed","Mahmud", p);
			Employee ob1 = new Employee("Ashraf","Mahmud", p);
			double salary = ob.get();
			System.out.println("Yearly salary is                : "+salary);
			double r_salary = ob1.set();
			System.out.println("After raise 10% yearly salary is: "+r_salary);
		}
	}


