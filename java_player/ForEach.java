//Given two numbers represented by two arrays, write a function that returns sum array. The sum array is an array representation of addition of two input arrays
import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  int my[]=new int[2];
       my[0]=1;
       my[1]=2;
       int ma[]=new int[2];
       ma[0]=2;
       ma[1]=3;
       int result1=0;
       int result=0;
      int result2;
  public void set()
  {
    
       for(int i:my)
       {
           result+=i;
       }
       for(int j:ma)
       {
           result1+=j;
       }
       result2=result+result1;
      System.out.println(result2); 
       
    }


	public static void main (String[] args) throws java.lang.Exception
	{
		GUVI g=new GUVI();
      g.set();
	}
}
