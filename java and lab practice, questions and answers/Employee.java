
package javaapplication1;

import java.util.*;
public class Employee {
    private String firstName;
    private String lastName;
    private Double monthlySalary;
    
    public void Employee(String firstName,String lastName,double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

public Employee (double monthly )
{
  if ( monthly > 0.00 )
     monthlySalary = monthly;

  if ( monthly< 0.00 )
     monthlySalary = 0.00;

} // end Salaryconstructor

// method to set first name
public void setFirstName( String first )
{
  firstName = first;
} // end method setFirstName

// method to set last name
public void setLastName( String last )
{
  lastName = last;
} // end method setLastName

// method to setmonthly salary
public void setMonthlySalary( Double monthly )
{
  monthlySalary = monthly;
} // end method setLastName

// method toretrieve first name
public String getFirstName()
{
  return firstName;
} // end method getFirstName

// method toretrieve last name
public String getLastName()
{
  return lastName;
} // end method getFirstName

// method toretrieve first name
public Double getMonthlySalary()
{
  return monthlySalary;
} // end method getMonthlySalary


// method to display employee information to user
public void displayMessage()
{
  System.out.printf("%s %s has a monthly salary of$%.2f\n", getFirstName(), getLastName(), getMonthlySalary() );
} // end method displayMessage 
}