package bca.seventh.java.assignment;
import java.util.Scanner;
public class ReadNumberAndFindLargestSmallest 
{
 public  static void main(String args[])
 {
    int arr[],lar,small;
   try{
    arr=new int[10];
Scanner scanob=new Scanner(System.in);
String s="";
for(int i=0;i<10;i++)
{
    System.out.println("Enter a number at "+(i+1)+" 'th position :");
    s=scanob.next();
    arr[i]=Integer.parseInt(s);
}
lar=arr[0];small=arr[0];
for(int i=0;i<10;i++)
{if(arr[i]>lar)lar=arr[i];
if(arr[i]<small)small=arr[i];
}
System.out.println("The largest value is :"+lar);
System.out.println("The Smallesr value is :"+small);
}
catch(NumberFormatException e)
 {
  System.out.println("oops error occor: "+e.getMessage());
 }
}
}