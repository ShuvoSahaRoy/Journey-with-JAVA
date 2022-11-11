
package simpleDemo;

import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        while(true){
            try{
            Scanner in = new Scanner(System.in);
            System.out.println("plz enter a number : ");
            int a = in.nextInt();
            System.out.println("plz enter another number : ");
            int b = in.nextInt();
            int result = a/b;
            System.out.printf("a = %d  b= %d  result = %d\n",a,b,result);
            }catch(Exception e){
                System.out.println("Exception : "+e);
            System.out.println("plz try with integer");
            }
        }
        
        
    }
    
}
