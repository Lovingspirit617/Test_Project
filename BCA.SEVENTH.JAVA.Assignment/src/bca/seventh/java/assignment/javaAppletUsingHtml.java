package bca.seventh.java.assignment;
import java.awt.*;
import java.applet.*;

public class javaAppletUsingHtml extends Applet
{
     String name,address,DOB;
    public void init()
    {
    setBackground(Color.red);
    setForeground(Color.BLACK);
    name=getParameter("myName");
    name="Name :"+name+ " .";
    address=getParameter("myAddress");
    address="Address :"+address+" .";
    DOB=getParameter("dob");
    DOB="Date of Birth : "+DOB;
    }
    public void start()
    {
       showStatus("starting my applet") ;
    }
    public void stop()
    {
    showStatus("Stopping my applet");
    
    }
    public void paint(Graphics g)
    {
    g.drawString(name,40,40);
    g.drawString(address,40,60);
    g.drawString(DOB,40,80);
    }

}
