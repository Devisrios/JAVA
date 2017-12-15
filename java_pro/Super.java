//Use your inherited string class to call the parent class method to print
import java.util.*;
import java.lang.*;
import java.io.*;
public class Staff {
   String name="Shree";
   int marks=100;
   String s="Good";
   Staff()
   {
       System.out.println("I am JAVA programmer");
   }
   public void behaviour()
   {
 System.out.println(s);
   }
}
public class Student extends Staff {
Student()
{
    super();
}
public void getStaffName()
{
    System.out.println("Name "+super.name);
}
public void getMarks()
{
  System.out.println("Marks "+super.marks) ; 
}
public void getBehaviour()
{
    String s="bad";
    System.out.println("Behaviours "+super.s);
}
    
    public static void main(String[] args) {
        Student s1=new Student();
        s1.getStaffName();
        s1.getMarks();
        s1.getBehaviour();
    }
}

