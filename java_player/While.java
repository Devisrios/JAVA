//Print all the leap years between 1900 and 2020
import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  public void get()
  {
    
   int year=1900;
       
  }
  public void set()
  {
    
       while(year<=2020)
       {
           if(year%400==0||year%4==0)
           {
               System.out.println("leap year");
               year++;
           }
           else
           {
               System.out.println("not");
               year++;
           }
           
       }
  }
  public static void main (String[] args) throws java.lang.Exception
	{
		GUVI g=new GUVI();
    g.get();
    g.set();
	}
}
