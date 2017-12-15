//Write a person class and get the details and set the values to the member variables
import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  private int rollno;
  private String studentname;
  public void setName(String value)
  {
    studentname=value;
  }
  public void setRollno(int value)
  {
    rollno=value;
  }
  public String getName()
  {
    return studentname;
  }
  public int getRollno()
  {
    return rollno;
  }
  
  
	public static void main (String[] args) throws java.lang.Exception
	{
	GUVI g=new GUVI();
      g.setName("Devishree");
      g.setRollno(006);
      System.out.prointln(g.getName());
      System.out.prinltn(g.getRollno());
      
	}
}
