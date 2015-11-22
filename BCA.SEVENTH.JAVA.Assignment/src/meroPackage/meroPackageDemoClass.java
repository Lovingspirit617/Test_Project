package meroPackage;
import meroPackage.meroInterface;

public class meroPackageDemoClass
{
  public <t extends Number> double sum(t num1,t num2)  
  {
      double result;
      result=num1.doubleValue()+num2.doubleValue();
      return(result);
  }
  public <t extends Number> double subtract(t num1,t num2)
  {
  double result;
      result=num1.doubleValue()-num2.doubleValue();
     
      return(result);
  }
   public <t extends Number> double multiply(t num1,t num2)
  {
  double result;
      result=num1.doubleValue()*num2.doubleValue();
      return(result);
  }
}



