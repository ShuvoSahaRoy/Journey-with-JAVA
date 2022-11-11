
package javaapplication1;

import java.util.Scanner;


public class EmployeeTest {
    public static void main( String args[] )
{
  Scanner input = new Scanner(System.in );

  Employee newEmployee = new Employee( 0.00 );

  System.out.println( "Please enter Employee's firstname:" );
  String first = input.nextLine();
  newEmployee.setFirstName( first );
  System.out.println();
  
  System.out.println( "Please enter Employee's lastname:" );
  String last = input.nextLine();
  newEmployee.setLastName( last );
  System.out.println();

  System.out.println( "Please enter Employee'smonthly salary:" );
  double monthly = input.nextDouble();
  newEmployee.setMonthlySalary( monthly );
  System.out.println();

  
  newEmployee.displayMessage();    
} // end methodmain
}
