
package simpleDemo;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Shuvo Saha Roy";
        String s2 = new String ("SSROY");
        System.out.printf("Name: %s %s %d\n",s1,s2,s1.length());
        if(s1.equals(s2)){
            System.out.println("Equal\n");
        }
        else{
            System.out.println("Unequal\n");
        }
    }
    
}
