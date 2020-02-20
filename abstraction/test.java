
package abstraction;

public class test {
    
    public static void main(String[] args) {
        MobileUser mu;
        
        mu = new AAA();
        mu.sendMessage();
        mu.call();
        mu = new ZZZ();
        mu.sendMessage();
    }
}
