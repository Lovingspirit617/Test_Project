package bca.seventh.java.assignment;
import java.io.*;
import java.io.RandomAccessFile;
import java.util.Scanner;
public class write10studentNameAndAddressAnRead2ndData 
{    
    public static void readAndWriteRecord()
        {
        String FilePath="Qno27studentRecord.txt";
        int seek;
        Scanner scanob=new Scanner(System.in);
       String Name="", Address="";
        try{
        RandomAccessFile raf=new RandomAccessFile(FilePath,"rw");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=1;i<=10;i++)
        {
        System.out.println("enter a Name of student");
        Name=scanob.next();         
         raf.write(Name.getBytes());
         raf.writeChars("\n");
        // for address
       System.out.println("Enter a Address of student");
        Address=scanob.next();
        raf.write(Address.getBytes());
        raf.writeChars("\n");
        }
        }
        catch(IOException e)
        { System.out.println("Error on writing to file");        
        }
        }
    public  static void getSecondRecord()
    {
        try{
            System.out.println("The second record is :\n====================");
            RandomAccessFile raf=new RandomAccessFile("Qno27studentRecord.txt","r");
            int byt;
            int count=0;
            while((byt=raf.read())!=-1)
            {
             if(byt=='\n')
             {
             //System.out.println("space found");
             count=count+1;
             }
             //means we are reading second record bytes only and displaying
             if(count>=2 && count<4)
             {
             char b=(char)byt;
             System.out.print(b);
             }            
            }
   
   
        }
        catch(IOException e)
        {
        System.out.println(e.getMessage());
        }
    }
        
    public static void main(String [] s)throws IOException
    {
        readAndWriteRecord();
        getSecondRecord();       
        
    }
        
  }
    
    
    
    

