
package simpleDemo;

import java.util.Scanner;
 
class factorial
{
   public static void main(String args[])
   {
      int n, i, fact = 1;
 
      System.out.println("Please Enter A Number");
      Scanner in = new Scanner(System.in);
 
      n = in.nextInt();
 
      if (n < 0)
         System.out.println("Number should be non-negative.");
      else
      {
         for (i = 1; i <= n; i++)
            fact = fact*i;
 
         System.out.println("Factorial of "+n+" is = "+fact);
      }
   }
}
