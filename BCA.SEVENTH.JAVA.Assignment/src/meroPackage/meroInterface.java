package meroPackage;
public interface meroInterface{
final float pi=22/7;
void circle_area(double r);
double square_area(double l);
double rectangle_area(double l,double b);
}

class interfaceDemoClass implements meroInterface
{
  
    double circle_area(double r) 
   {
   return pi*r*r;
   }
 
  double square_area(double l)
   {
   return l*l;
   }
 
  double rectangle_area(double l,double b)
  {
  return l*b;
  }
  public static void main(String []args)throws NumberFormatException
  {
  interfaceDemoClass ob=new interfaceDemoClass();
 System.out.println("area of circle having r=20 is = "+ob.circle_area(20));
 System.out.println("area of rectangle having length=20 and width=30 is = "+ob.rectangle_area(20,30));
 System.out.println("area of square having length=20 is = "+ob.square_area(20));
 
  }

  
  
}