//Write you own string class which will accept a character array in the constructor
import java.util.*;
import java.lang.*;
import java.io.*;
class St
  St(){
       char a[]={'a','b'};
       String str=new String(a);
       System.out.println(str);
   }
   St(char a[])
   {
       
       String str=new String(a);
       System.out.println(str);
   }
           
  
     
   
{
	public static void main (String[] args) throws java.lang.Exception
	{
St s1=new St();
char arr[]={'a','c'};
St s2=new St(arr);

	}
}
