
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class showMessageDialog2 {
    public static void main(String[] args) {
        
        ImageIcon img = new ImageIcon("Close-icon");
        JOptionPane.showMessageDialog(null, "Worng Password","Waring",1,img);
        JOptionPane.showMessageDialog(null, "Worng Password","Waring",2);
    }
    
}