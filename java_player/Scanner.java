//LCM of two numbers entered by user
import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  int n1,n2,lcm;
        public void get()
        {
      System.out.println("Enter the numbers:");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        }
public void set()
{
 lcm = (n1 > n2) ? n1 : n2;
  while(true)
        {
            if( lcm % n1 == 0 && lcm % n2 == 0 )
            {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            ++lcm;
        }
}

       

       
	public static void main (String[] args) throws java.lang.Exception
	{
		GUVI g=new GUVI();
      g.get();
      g.set();
	}
}
