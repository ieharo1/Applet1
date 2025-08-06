package applet1;

// Aplet1.java
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Scrappy Doo Coco
 */
public class Applet1 extends Applet{
    //Metodos:
    public void init(){
        this.setBackground(Color.white);
    }
    public void paint(Graphics g){
        g.drawString("Mi primer applet", 10, 10);
    }
    
}
