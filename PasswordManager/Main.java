import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.ImageIcon;

public class Main{
    public static void main(String[] args){
        
        ImageIcon image = new ImageIcon("Honeytrack.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);


        JLabel label = new JLabel();
        label.setText("Bro,do you even code");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text left,cntre,Right of Image
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("Algerian",Font.PLAIN,20));
        label.setIconTextGap(-20);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100,100,250,250);
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}