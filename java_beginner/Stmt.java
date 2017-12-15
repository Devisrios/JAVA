//CheckHitFlop (if-else): Write a program called CheckHitFlop which prints "Box Office Hit" if the int variable "DaysInTheatre" is more than or equal to 50; or prints "Flop" otherwise
import java.util.*;
import java.lang.*;
import java.io.*;
class CheckHitFlop
{
   public void set()
  {
     int days_in_theater=50;

    if(days_in_theater>=50)
    {
      System.out.println("BoxOfficeHit");
    }
    else
    {
      System.out.println("Flop");
    }
  }
	public static void main (String[] args) throws java.lang.Exception
	{
	CheckHitFlop f=new CheckHitFlop();
      f.set();
	}
}
