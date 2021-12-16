package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Window {
    
    public static void showMessage(String message){
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, message);
        
    }
    
}
