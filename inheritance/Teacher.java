
package inheritance;

public class Teacher extends person {
    String qualification;
    void display2(){
        display();
        System.out.println("Qualification : "+qualification);
    }
    
}
