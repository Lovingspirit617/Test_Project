package bca.seventh.java.assignment;
import java.io.*;
import java.io.Console;
import java.util.Scanner;
public class ReadNumberAndFindAvg {
    public static void main(String[] args) 
    {
      int arr[],sum=0;
      float avg=0f;
      
        try{
            arr=new int[10];
      
      Scanner scanob= new Scanner(System.in);
     for(int i=0;i<10;i++)
     {
      System.out.println("Enter a Number");
      String a=scanob.next();
      arr[i]=Integer.parseInt(a);
      sum+=arr[i];
      
     }
     System.out.println("TOTAL SUM IS : "+sum);
     avg=sum/10;
    System.out.println("The Average value is :"+avg);
      } 
      catch(NumberFormatException e)
      {
      System.out.println("hello error");
      }
      
    }
}
