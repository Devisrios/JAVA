//Write a enum that will have zip codes and write a program that will get a zip code and print the corrosponding city name
import java.util.*;
import java.lang.*;
import java.io.*;
class Num
{
  public enum CITYNAME{
    MADURAI,CHENNAI,TRICHY;
} 
CITYNAME city;
public Num(CITYNAME city)
{
    this.city=city;
}
public void zipcode()
{
    switch(city)
    {
        case MADURAI:
        {
          System.out.println( "madurai "+"625001");
            break;
        }
        case CHENNAI:
        {
            System.out.println("chennai "+"600001");
            break;
            
        }
        case TRICHY:
        {
            System.out.println("trichy "+"620001");
            break;
        }
        default:
        {
            System.out.println("invalid");
            break;
        }
    }
}
public static void main (String[] args) throws java.lang.Exception
	{
	   Num n1=new Num(CITYNAME.MADURAI);
       n1.zipcode();
        Num n2=new Num(CITYNAME.CHENNAI);
       n2.zipcode();
        Num n3=new Num(CITYNAME.TRICHY);
       n3.zipcode();

	}
}
