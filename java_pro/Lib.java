//Create a library management system implementing book lending and displaying the inventory as and when a book is issued/returned. Make sure you use the getter and setter methods while storing /retrieving any data about the book
package package9;
import java.io.*;
import java.util.*;
public class Lib {

    private   String b1;
  private  String b2;
   
        
    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {
        this.b1 = b1;
        StringTokenizer st1=new StringTokenizer(b1," ,");
       
        System.out.println("Books lending list");
        System.out.println(st1.nextToken());
        
        int n1=st1.countTokens();
        
        String[] ast1=new String[n1];
        
        int i=0;
  String a;
  while(st1.hasMoreTokens())
  {
    a=st1.nextToken();
    ast1[i]=a;
    i++;
  }
       String x="issued";
        if(Arrays.asList(ast1).contains(x))
        {
            System.out.println(b1);
        }
        String b="returned";
        if(Arrays.asList(ast1).contains(b))
        {
            System.out.println(b1);
            
        }
       
        
        
       
    }

    

    public String getB2() {
        return b2;
    }

    public void setB2(String b2) {
        this.b2 = b2;
         StringTokenizer st2=new StringTokenizer(b2,", ");
         System.out.println(st2.nextToken());
         int n2=st2.countTokens();
         String[] ast2=new String[n2];
         int i=0;
  String a;
  i=0;
  while(st2.hasMoreTokens())
  {
    a=st2.nextToken();
    ast2[i]=a;
    i++;
  }
  i=0;
  String x="issued";
   if(Arrays.asList(ast2).contains(x))
        {
            System.out.println(b2);
        }
   String b="returned";
    if(Arrays.asList(ast2).contains(b))
        {
            System.out.println(b2);
            
        }
    }
  //private member variable can be accessing another class
  import java.io.*;
import java.util.*;
import package9.Lib;
public class Li {

        public static void main(String[] args) {
        Lib l=new Lib();
        l.setB1("Shreebooks are issued");
        l.setB2("Devibooks are returned");
        
    }
}

 
