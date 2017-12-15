//Write your own string class and inherit and create a new class NumberString. The number string will get only numbers as its constructor and convert that into a string and it will have a print method to print the string contents.
import java.util.*;
import java.lang.*;
import java.io.*;
public class SuperClass {
    String str=new String("123");
    public void print()
    {
        System.out.println(str);
    }
}

class SubClass extends SuperClass
{
   public void print()
    {
    int i=Integer.parseInt(str);
    String str1=Integer.toString(i);
    System.out.println(str1);
    
    }
   
	public static void main (String[] args) throws java.lang.Exception
	{
       Superclass i=new SuperClass();
        i.print();
        SubClass i1=new subClass();
        i1.print();
       
		
	}
}
