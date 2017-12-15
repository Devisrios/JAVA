//Create your own string interface and inherit your class from it. Also write a string abstract class with a print method implemented
import java.util.*;
import java.lang.*;
import java.io.*;
public interface NewInterface {
    public  String COLOR="1";
    public void  print(String COLOR);
}
public  class Inter implements NewInterface {
public void print(String COLOR)
{
  String str="abc";
   
  System.out.println(str);
  String c=COLOR;
  System.out.println(c);
 
}
    public static void main(String[] args) {
     Inter i=new Inter();
    i.print("2");
    }
}

public abstract class NewClass {
    public String name;
   public void NewClass(String name)
  {
      String si="ab";
    System.out.println(si);
  }
            
}
public class Cl extends NewClass {
     public void NewClass(String name)
     {
         String s=name;
         System.out.println(s);
     }
public static void main(String[] args)
{
Cl c=new Cl();
c.NewClass("abc");
}
}
