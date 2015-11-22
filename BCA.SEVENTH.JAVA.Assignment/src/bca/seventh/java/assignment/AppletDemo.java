package bca.seventh.java.assignment;
import java.awt.*;
import java.applet.*;
public class AppletDemo extends Applet
{
    String name,address;
    public void init()
    {
       // setBackground(Color.LIGHT_GRAY);
    setForeground(Color.RED);
    name="My name is  Rabin Shrestha .";
    address="I live in Bharatpur 19 chitwan .";
    }
    public void start()
    {
    }
    public void paint(Graphics g)
    {
    g.drawString(name,40,40);
    g.drawString(address,40,60);
    }   
}
