
package simpleDemo;

import java.util.*;
public class fibonacci {
    public static void main(String args[])  
            {    
                int a=0,b=1,c,i,num; 
                System.out.println("Please enter a number ");
                Scanner in = new Scanner (System.in);
                num = in.nextInt();
                System.out.print(a+" "+b);    

                for(i=2;i<num;++i) 
                {    
                    c=a+b;    
                    System.out.print(" "+c);    
                    a=b;    
                    b=c;    
                }
                System.out.println();

            }
    
    }   
