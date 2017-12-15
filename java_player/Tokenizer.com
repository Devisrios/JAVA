//Write a Java Program to do following String manipulation

String address1 = " Mr.Jack,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
String address2 = " Ms Jill,Door No 53,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
String address2 = " Mr Holmes,Door No 13,Valmiki Street,32d Main Road,Saidapet,Chennai,Pin-600115";
String address1 = " Mr.Davinci,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
Expected Output

Print  the Names in all addresses
If address are same but names are different,print as duplicate entry 
Print all addresses in Mason Street
Check if all addresses have Pincode
import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  String address1 = " Mr.Jack,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
String address2 = " Ms Jill,Door No 53,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
String address2 = " Mr Holmes,Door No 13,Valmiki Street,32d Main Road,Saidapet,Chennai,Pin-600115";
String address1 = " Mr.Davinci,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113";
  public void set()
  {
    
  StringTokenizer st1=new StringTokenizer(address1,",");
   StringTokenizer st2=new StringTokenizer(address2,",");
   StringTokenizer st3=new StringTokenizer(address3,",");
   StringTokenizer st4=new StringTokenizer(address4,",");
  System.out.println(st1.nextToken());
  System.out.println(st2.nextToken());
  System.out.println(st3.nextToken());
  System.out.println(st4.nextToken());
  int n1=st1.countTokens();
  int n2=st2.countTokens();
  int n3=st3.countTokens();
  int n4=st4.countTokens();
  String[] ast1=new String[n1-1];
   String[] ast2=new String[n2-1];
   String[] ast3=new String[n3-1];
   String[] ast4=new String[n4-1];
   int i=0;
  String a;
  while(st1.hasMoreTokens())
  {
    a=st1.nextToken();
    ast1[i]=a;
    i++;
  }
  i=0;
  while(st2.hasMoreTokens())
  {
    a=st2.nextToken();
    ast2[i]=a;
    i++;
  }
  i=0;
  while(st3.hasMoreTokens())
  {
    a=st3.nextToken();
    ast3[i]=a;
    i++;
  }
  i=0;
  while(st4.hasMoreTokens())
  {
    a=st4.nextToken();
    ast4[i]=a;
    i++;
  }
  i=0;
  boolean b=Arrays.equals(ast1,ast2);
  if(b)
  {
    System.out.println("add1 and add2 has duplicate entry");
  }
  else
  {
    System.out.println("add1 and add2 has not duplicate entry");
  }
  b=Arrays.equals(ast1,ast3);
  if(b)
  {
    System.out.println("add1 and add3 has duplicate entry");
  }
  else
  {
    System.out.println("add1 and add3 has not duplicate entry");
  }
  b=Arrays.equals(ast1,ast4);
  if(b)
  {
    System.out.println("add1 and add4 has duplicate entry");
  }
  else
  {
    System.out.println("add1 and add4 has not duplicate entry");
  }
  b=Arrays.equals(ast2,ast3);
  if(b)
  {
    System.out.println("add2 and add3 has duplicate entry");
  }
  else
  {
    System.out.println("add2 and add3 has not duplicate entry");
  }
  b=Arrays.equals(ast2,ast4);
  if(b)
  {
    System.out.println("add2 and add4 has duplicate entry");
  }
  else
  {
    System.out.println("add2 and add4 has not duplicate entry");
  }
  b=Arrays.equals(ast3,ast4);
  if(b)
  {
    System.out.println("add3 and add4 has duplicate entry");
  }
  else
  {
    System.out.println("add3 and add4 has not duplicate entry");
  }
  String x="Mason Street";
  if(Arrays.asList(ast1).contains(x))
  {
    System.out.println(address1);
  }
  if(Arrays.asList(ast2).contains(x))
  
    System.out.println(address2);
  }
  
  if(Arrays.asList(ast3).contains(x))
  {
    System.out.println(address3);
  }
  
  if(Arrays.asList(ast4).contains(x))
  {
    System.out.println(address4);
  }
  System.out.println(address1.contains("pin"));
System.out.println(address1.contains("pin"));
System.out.println(address1.contains("pin"));
System.out.println(address1.contains("pin"));
}
public static void main (String[] args) throws java.lang.Exception
	{
		GUVI g=new GUVI();
      g.set();
	}
}
