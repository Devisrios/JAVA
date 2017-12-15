//Write a program to compare two strings without using strcmp() function
import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  String str1="abcde";
  String str2="bcd";
  public void set()
  {
    if(str1.contentEquals(str2))
    {
      System.out.println("Equal");
    }
    else
    {
      System.out.println("Not Equal");
    }
  }
	public static void main (String[] args) throws java.lang.Exception
	{
		GUVI g=new GUVI();
      g.set();
	}
}
