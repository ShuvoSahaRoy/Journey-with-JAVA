
package simpleDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArryListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(22);
        number.add(222);
        number.add(1);
        number.add(11);
        number.add(111);
        System.out.println("Before sorting arraylist "+number);
        System.out.println(number.size());
        //System.out.println(number.get(0));  //for getting index value
        Collections.sort(number);
        System.out.println("After sorting " +number);
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("After sorting " +number);
    }
}
