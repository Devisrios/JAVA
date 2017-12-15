//Find Highest and lowest number in array
import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  
	public static void main (String[] args) throws java.lang.Exception
	{
	 int m[]=new int[5];
      m[0]=8;
       m[1]=2;
       m[2]=3;
       m[3]=4;
       m[4]=5;
       int largest=m[0];
       int smallest=m[0];
       for(int i=0;i<m.length;i++)
       {
           if(m[i]>largest)
           {
               largest=m[i];
           }
            else if(m[i]<smallest)
            {
               smallest=m[i];
            }
       }
           System.out.println(largest);
           System.out.println(smallest);
    }
}
