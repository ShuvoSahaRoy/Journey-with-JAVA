
package simpleDemo;

import java.util.Scanner;


public class ACIItoDecimal {
    public void convert(char a){
        int num = (int)a;
        System.out.println("The ACII value for '"+a+"' is : "+num);
    }
    public static void main(String[] args) {
        
        ACIItoDecimal obj = new ACIItoDecimal();
       
        System.out.println("PLEASE ENTER A CHARACTER :");
        
        Scanner reader = new Scanner(System.in);
        char c = reader.next().charAt(0);
        obj.convert(c);
        
    }
    
}
