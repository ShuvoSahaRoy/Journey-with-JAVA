
package simpleDemo;


class Number {
   int x;
}

public class callByrefer {
    public static void main ( String[] args ) {
      Number a = new Number();
      a.x=3;
      System.out.println("Value of a.x before calling increment() is "+a.x);
      increment(a);
      System.out.println("Value of a.x after calling increment() is "+a.x);
   }

   public static void increment(Number n) {
      System.out.println("Value of n.x before incrementing x is "+n.x);
      n.x=n.x+1;
      System.out.println("Value of n.x after incrementing x is "+n.x);
   }
    
}
