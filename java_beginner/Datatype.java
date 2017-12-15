import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  String name;
String city;
byte age;
float height;
boolean married;
char sex='F';
double city_population;
Scanner sc=new Scanner(System.in);
public void getDetails()
{
name=sc.next();
city=sc.next();
age=sc.nextByte();
height=sc.nextFloat();
married=sc.nextBoolean();
city_population=sc.nextDouble();
}
public void setDetails()
{
    System.out.println("Name:"+ name+"\n"+"City:"+city+"\n"+"Age:"+age+"\n"+"Height"+height+"\n"+"Married"+married+"\n"+"Sex"+sex+"\n"+"City_Population"+city_population);
    
    
}
public static void main (String[] args) throws java.lang.Exception
	{
	GUVI g=new GUVI();
      g.getDetails();
      g.setDetails();
	}
}
