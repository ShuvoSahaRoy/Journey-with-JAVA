package simpleDemo;
import java.util.*;
public class uva10679 {

    public static void main(String[] args) {
        String str;
        String s ;
        Scanner in = new Scanner (System.in);
        int tc = in.nextInt();
        for(int i=0;i<tc;i++){
            str = in.next();
            int ch = in.nextInt();
            for (int j = 0; j < ch; j++) {
                s = in.next();
                if(str.contains(s)== true){
                    System.out.println("y");
                }else{
                    System.out.println("n");
                }
                
            }
        }
    }

}
