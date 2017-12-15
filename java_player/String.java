//
Count the characters,numbers,alphanumerical in a given string
import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  int numbercount=0,alphacount=0;
  public void get()
  {
    
        String s="hello world new@123";
       for(int i=0;i<s.length();i++)
        {
           char c=s.charAt(i);
            
        
        if(Character.isDigit(c))
        {
            numbercount++;
        }
        else if(Character.isLetterOrDigit(c))
        {
            alphacount++;
        }
                
    }
  }
    public void set()
    {
        System.out.println(s.length());
        System.out.println(numbercount);
        System.out.println(alphacount);
}

	public static void main (String[] args) throws java.lang.Exception
	{
		GUVI g=new GUVI();
      g.get();
      g.set();
	}
}
