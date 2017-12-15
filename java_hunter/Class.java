//Write a simple calculator class with basic arithmatic methods
import java.util.*;
import java.lang.*;
import java.io.*;
class Class
{
  int a,b,c,d,e,f;
    Scanner sc=new Scanner(System.in);
   
    public void setValue()
    {
        System.out.println("Enter the no");
        a=sc.nextInt();
        b=sc.nextInt();
    } 
    public void getAdd()
    {
        c=a+b;
        System.out.println("addition: "+c);
    }
    public void getSub()
    {
      d=a-b;
     System.out.println("substration: "+d);  
    }
    public void getMul()
    {
        e=a*b;
        System.out.println("multiplication: "+e);
        
    }
    public void getDiv()
    {
        f=a/b;
        System.out.println("division: "+f);
    }
    

    
    
	public static void main (String[] args) throws java.lang.Exception
	{
      
Class c=new Class();
c.setValue();
c.getAdd();
c.getSub();
c.getMul();
c.getDiv();
   
	
	}
}
