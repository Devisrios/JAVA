import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  int a=10,b=20,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
  public void getDetails()
  {
  c=a+b;d=a-b;e=a*b;f=b/a;g=b%a;h=b++;i=b--;j=a&b;k=a|b;l=a^b;m=~a;n=a<<2;o=a>>2;
  p=a>>>2;
  }
  public void setDetails()
  {
  System.out.println(c+""+d+""+e+""+f+""+g+""+h+""+i+""+j+""+k+""+l+""+m+""+n+""+o+""+p);
  if(a==10&&b==20)
  {
    System.out.println("Yes");
  }
   else if(a==10||b==1)
   {
     System.out.println("Yes");
   }
    else if(!(a==10&&b==1))
    {
      System.out.println("Yes");
    }
  }

    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		GUVI g=new GUVI();
      g.getDetails();
      g.setDetails();
	}
}
