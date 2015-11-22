package bca.seventh.java.assignment;
import java.io.*;
import java.util.Scanner;

public class write10CustomerRecordAndReadAll
{
 void readAndWriteRecord()
        {
        String FilePath="Customer.txt";
        int seek;
        Scanner scanob=new Scanner(System.in);
       String Name="", Address="";
        try{
        RandomAccessFile raf=new RandomAccessFile(FilePath,"rw");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=1;i<=10;i++)
        {
        System.out.println("enter a Name of Customer");
        Name=scanob.next();         
         raf.write(Name.getBytes());
         raf.writeChars("\n");
        // for address
       System.out.println("Enter a Address of Customer");
        Address=scanob.next();
        raf.write(Address.getBytes());
        raf.writeChars("\n");
        }
        }
        catch(IOException e)
        { System.out.println("Error on writing to file");        
        }
        }   
void displayAllRecord() throws IOException
{
try{
    RandomAccessFile raf=new RandomAccessFile("Customer.txt","r");
    String str;
    byte data[];
    while((str=raf.readLine())!=null)
    {
    System.out.println(str);    
    }
  }  
    catch(FileNotFoundException e)
    {
    System.out.println(e.getMessage());
    }
}
public static void main(String arg[])
{
write10CustomerRecordAndReadAll ob=new write10CustomerRecordAndReadAll();
ob.readAndWriteRecord();
try{
ob.displayAllRecord();
}catch(IOException e){System.out.println(e.getMessage());}
}
}
