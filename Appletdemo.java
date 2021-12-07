import java.applet.Applet;
import java.awt.Graphics;

public class Appletdemo extends Applet{

    public void paint(Graphics g){
        String msg ="HlLO, Everyone welcome to my Applet";
        g.drawString(msg,80,150);
    }
}

/*HTML CODE : Appletdemo.html*/

