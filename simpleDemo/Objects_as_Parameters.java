
package simpleDemo;


public class Objects_as_Parameters {
    int a, b;
Objects_as_Parameters(int i, int j) {
a = i;
b = j;
}
// return true if o is equal to the invoking object
    boolean equals(Objects_as_Parameters o) {
    if(o.a == a && o.b == b)
        return true;
    else return false;
}
}
class PassOb {
public static void main(String args[]) {
Objects_as_Parameters ob1 = new Objects_as_Parameters(100, 22);
Objects_as_Parameters ob2 = new Objects_as_Parameters(100, 22);
Objects_as_Parameters ob3 = new Objects_as_Parameters(-1, -1);
System.out.println("ob1 == ob2: " + ob1.equals(ob2));
System.out.println("ob1 == ob3: " + ob1.equals(ob3));
}
}
 
