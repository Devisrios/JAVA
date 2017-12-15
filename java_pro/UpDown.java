//Perform both the types of casting using Number, integer, float and double data types
import java.util.*;
import java.lang.*;
import java.io.*;
public class Class1
{
  public void get()
  {
    int i=10;
    System.out.println(i);
  }
}
public class Class2 extends Class1
{
  public void get1()
  {
    float f=20;
    System.out.println(f);
  }
}
public class Class3 extends Class2
{
  public void get2()
  {
    double d=10;
    System.out.printn(d);
  }
  public static void main(String args[])
  {
    Class3 c1=new Class3();
    c1.get2();
    Class2 c2=c1;//Upcasting
    c2.get1();
    Class3 c3=(Class3)c2;//downcasting
    c3.get2();
  }
}
