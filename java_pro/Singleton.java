//Write a singleton string class
import java.util.*;
import java.lang.*;
import java.io.*;
public class NewMain {
private static  NewMain obj;
private NewMain()
{
    System.out.println("abc");
}
public static NewMain getInstance()
{
    if(obj==null)
    {
        obj=new NewMain();
        
    }
    return obj;
}
public void getSomething()
{
    System.out.println("here");
}

    public static void main(String[] args) {
  NewMain n1=new NewMain().getInstance();
  
    n1.getSomething();
    }
}

