
package polymorphism;

public class Test {
    public static void main(String[] args) {
        person p = new person();
         p.display();
        //Teacher t = new Teacher();
        p = new Teacher();
        p.display();
        //Student s = new Student();
        p = new Student();
        p.display();
    }
}
