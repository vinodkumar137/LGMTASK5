
package text.editor;

import java.awt.Font;
import javax.swing.*;

public class About extends JFrame{
    
    About(){
        setBounds(700,300,700,550);
        setTitle("About Text Editor Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("download.png"));
        setIconImage(icon.getImage());
        setLayout(null);
        
        JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("download.png")));
        iconLabel.setBounds(100, 80, 200, 180);
        add(iconLabel);
        
        JLabel textLabel = new JLabel("<html><b><u>Welcome to Text Edior</u></b><br><br>Text Edior is a simple text edior for Microsoft Windows and a basic text-editing program which enables computer users to create documents.<br>All right reserved by vinod kumar</html>");
        textLabel.setBounds(100, 200, 500, 300);
        textLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,18));
        add(textLabel);
    }
    public static void main(String[] args){
        new About().setVisible(true);
    }

}
