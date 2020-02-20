
package nested_class;

public class MemberInnerclass {
    private int data=30;  
        class Inner{  
         void msg(){System.out.println("data is "+data);}  
        }  
        public static void main(String args[]){  
         MemberInnerclass obj=new MemberInnerclass();  
         MemberInnerclass.Inner in=obj.new Inner();  
         in.msg();  
        }  
    
}
