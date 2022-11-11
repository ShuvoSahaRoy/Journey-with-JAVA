
package checkConstructor;

public class Box {
    int width;
    int height;
    int depth;
    Box(int a,int b,int c){
        width = a;
        height = b;
        depth = c;
}
    
   /*void setdata(int a,int b,int c){
        width = a;
        height = b;
        depth = c;
    }*/
    
    void display(){
        System.out.printf("Height = %d\nWight = %d\nDepth = %d\n",height,width,depth);
    }
}