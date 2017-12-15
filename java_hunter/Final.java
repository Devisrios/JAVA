//Write your string class that cannot me inherited and a method variable which is not modifiable
import java.util.*;
import java.lang.*;
import java.io.*;
final class GUVI
{
   final  String  my_variable="Shree";
    final void set()
    {
      System.out.println(my_variable);  
    }
   
	public static void main (String[] args) throws java.lang.Exception
	{
		
    GUVI f=new GUVI();
    f.set();
    }
}
	
