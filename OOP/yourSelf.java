
package OOP;

public class yourSelf{
    
    String name,phn;
    int id;
    void setInformation(String n,String m,int a){
        name = n;
        phn = m;
        id = a;
    }
    void displayInformation()
    {
        System.out.printf("Name = %s\nPhn : %s\nId = %d\n",name,phn,id);
    }
}