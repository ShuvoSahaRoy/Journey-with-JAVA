
package simpleDemo;
import java.util.*;

public class ARRAYloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int ar[] = new int[5];
        for(int x=0;x<ar.length;x++){
            ar[x] = in.nextInt();
        }
        for(int x=0;x<ar.length;x++){
            System.out.println(ar[x]);
        }
        
    }
    
    
}
