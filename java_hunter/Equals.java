//Create you own string class and two string objects and compare the objects using equals and == methods
import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
   String s1=new String("abc");
        String s2=new String("abc");
        public void set()
        {
        System.out.println("s1.equlas(s2) "+(s1.equals(s2)));
        System.out.println("s1==s2 "+(s1==s2));
        }
	public static void main (String[] args) throws java.lang.Exception
	{
		GUVI g=new GUVI();
      g.set();
	}
}
