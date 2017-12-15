//Modify your string class to have a setter method which will accept any data type and convert them to string and store it and print it
import java.util.*;
import java.lang.*;
import java.io.*;
public class Poly  {
    
      public  void setter(String s)
        {
     String st=s;
     System.out.println(st);
        }
}
public class Poly1 extends Poly {
    public void setter(int i)
    {
     int i1=i;
    String st=Integer.toString(i1);
    System.out.println(st);
    }
    public static void main(String[] args)
    {
        Poly n1=new Poly1();
       n1.setter("10");
        
        
    }
}
