
import javax.swing.JOptionPane;

public class showInputMessage {
    public static void main(String[] args) {
        
        
        String name = JOptionPane.showInputDialog(null,"Enter first name : ","this is title",3);
        String name2 = JOptionPane.showInputDialog(null,"Enter last name : ","this is title",3);
        JOptionPane.showMessageDialog(null, name+" "+name2+" Welcome to swing");
        
    }
}
