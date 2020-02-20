
package inheritance;

public class person {
    private String name;
    private int age;
    public void setname(String n){
        name = n;
    }
    public void setage(int a){
        age = a;
    }
    
    void display(){
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
    }
    
}
