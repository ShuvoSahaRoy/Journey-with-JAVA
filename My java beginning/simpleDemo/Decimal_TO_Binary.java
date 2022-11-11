
package simpleDemo;

import java.util.Scanner;


public class Decimal_TO_Binary{
 
  public void Convert(int num){
     int binary[] = new int[40];
     int index = 0;
     while(num > 0){
       binary[index++] = num%2;
       num = num/2;
     }
     for(int i = index-1;i >= 0;i--){
       System.out.print(binary[i]);
     }
  }
 
  public static void main(String a[]){
     Decimal_TO_Binary obj = new Decimal_TO_Binary();
     
     Scanner in = new Scanner(System.in);
     System.out.print("Please Enter a number : ");
     int n = in.nextInt();
     
      System.out.print("Binary Reprentation of "+n+ " is : ");
     obj.Convert(n);
      System.out.println("\n");
  }
}