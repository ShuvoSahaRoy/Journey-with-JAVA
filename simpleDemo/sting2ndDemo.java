
package simpleDemo;


public class sting2ndDemo {
    public static void main(String[] args) {
        String firstName ="Shuvo";
        String lastName= " Saha Roy";
        String fullName = firstName.concat(lastName);
        System.out.println("MY name is "+fullName);
        String[] names ={"aaa","dvv","dfa","fsf"};
       /* for (String x : names) {
            System.out.println(x);
        }*/
        for (int i = 0; i < 4; i++) {
            
            System.out.println(names[i]);
        }
    }
    
}
