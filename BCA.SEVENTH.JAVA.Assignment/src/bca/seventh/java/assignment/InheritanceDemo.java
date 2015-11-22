package bca.seventh.java.assignment;
import java.util.Scanner;
import java.util.Random;
class Account
{
int custid, year;
double initialAmt,totalIntrestAmount,finalAmount;
Scanner scanob=new Scanner(System.in);
void get_account_info()
{
Random randob=new Random();// assigning random customer id.
custid=randob.nextInt();
System.out.println("Enter a Initial Amount:");
String s=scanob.next();
initialAmt=Double.parseDouble(s);
System.out.println("Enter year passed :");
s=scanob.next();
year=Integer.parseInt(s);
}
void display_Account_info()
{
    totalIntrestAmount=(initialAmt*year*12)/100;
    finalAmount=initialAmt+totalIntrestAmount;
    System.out.println("Account information\n==================");
    System.out.println("Customer ID="+custid);
    System.out.println("Initial Amount="+initialAmt);
    System.out.println("Total interest of "+year+" years is="+totalIntrestAmount);
    System.out.println("Total Balance on Account="+finalAmount);
}

}
class customer extends Account 
{
String cname,caddress,dob;
void create_customer()
{

System.out.println("Enter a customer name:");
cname=scanob.next();

System.out.println("Enter Address:");
caddress=scanob.next();
System.out.println("Enter Date of birth");
dob=scanob.next();
get_account_info();
}
void display_custinfo()
{
System.out.println("Customer information\n==============");
System.out.println("customer name:"+cname);
System.out.println("Address: "+caddress);
System.out.println("Date of Birth :"+dob);
display_Account_info();
}
}

public class InheritanceDemo {
    public static void main(String args[])
    {
    try
    {
        customer cust=new customer();
        cust.create_customer();
        cust.display_custinfo();
     
    }
    catch(Exception e)
    {
    System.out.println("oops error occored");
    }
    }
    
}

