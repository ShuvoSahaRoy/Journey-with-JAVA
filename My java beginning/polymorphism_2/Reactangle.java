
package polymorphism_2;

public class Reactangle extends Shape {
    
    double length,width;
    Reactangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    double area(){
        return length * width;
    }
}
