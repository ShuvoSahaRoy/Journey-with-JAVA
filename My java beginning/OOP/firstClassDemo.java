
package OOP;

import java.util.Scanner;

public class firstClassDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        yourSelf ob1= new yourSelf();
        yourSelf ob2= new yourSelf();
        
        ob1.name = in.nextLine();
        ob1.phn = in.nextLine();
        ob1.id = in.nextInt();
        ob1.displayInformation();
        ob2.name = "SSROY";
        ob2.phn = "01843295535";
        ob2.id = 36;
        ob2.displayInformation();
        
    }
    
}
