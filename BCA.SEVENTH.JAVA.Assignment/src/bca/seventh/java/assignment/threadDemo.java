package bca.seventh.java.assignment;
import java.io.*;
import java.lang.Thread.*;
class muliple_tbl extends Thread
{
public void run()
{
System.out.println("The multiplication table of 10 :\n==================================");
for(int i=1;i<=10;i++)
{
System.out.println("10 * "+i+" = "+ i*10);
}
}
}
class oxford extends Thread
{
public void run()
{
    for(int i=1;i<11;i++)
    {
    System.out.println("Oxford college of engineering and management");
    }
}
}
public class threadDemo extends Thread
{
    public static void main(String arg[])
    {
    muliple_tbl mult_ob=new muliple_tbl();
    oxford oxf=new oxford();
    mult_ob.setPriority(MAX_PRIORITY);
    oxf.setPriority(MIN_PRIORITY);
    mult_ob.start();
    oxf.start();
    }    
}
