
package javaapplication1;

import java.util.Scanner;
public class lab26 {
    public static void main(String[] args) {
        String word;
        String temp = "";
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter five letter string : ");
        word = in.nextLine();
        System.out.println("Three letter strings: ");
       int first,second;
        for(first =0; first<=4; first++)
        {
            for(second = 0; second<=4; second++)
            {
                if(second == first)
                    continue;
                for(int third = 0 ; third<=4 ; third++){
                    if(third == first || third == second)
                        continue;
                    System.out.print(String.valueOf(word.charAt(first))+
                                                    word.charAt(second) +
                                                    word.charAt(third)+"\n");
                }
                    
            }
        }
    }
    
}
