
package simpleDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListScanning {
    public static void main(String[] args) {
        ArrayList<Integer> number= new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            number.add(in.nextInt()) ;
        }
        System.out.println(number);
    } 
}
