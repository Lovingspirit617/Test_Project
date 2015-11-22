package bca.seventh.java.assignment;
import meroPackage.meroPackageDemoClass;
public class PackageAndInterfaceDemo
{
public static void main(String s[])    
{
    try{
    meroPackageDemoClass ob=new meroPackage.meroPackageDemoClass();
    
    //making object of a class that implements an custom interface
    System.out.println("sum of 3.89 and 39.="+ob.sum(3.89,39.909));
    System.out.println("subtract of 3.89 and 39.909="+ob.subtract(3.89,39.909));
    System.out.println("multiply of 3.89 and 39.909="+ob.multiply(3.89,39.909));
    }
    catch(NumberFormatException e)
    {
    System.out.println("number format error");
    }
}
}

