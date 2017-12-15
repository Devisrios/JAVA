//Write a program GenerateCoupon which prints the coupon amount based on the purchase made by the customer.If purchase is the in the range of

1.Rs.20000 & Above –Free Trolley Suitcase

2.Rs.10000 & Above –Free Travel Bag

3.Rs.5000 & Above –Free BackPck

4.Below 5000 –"Collect money even for cover we give "


Sample Input: Purchased Amount: Rs.5000

Sample Output: Collect money even for cover we give

import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  int purchased_amt=5000;
  public void set()
  {
    if(purchased_amt>=20000)
    {
      System.out.pritnln("Free Trolley suitcase");
    }
    else if(purchased_amt>=10000)
    {
      System.out.println("Free Travel Bag");
    }
    else if(purchased_amt>5000)
    {
      System.out.println("Free BackPck");
    }
    else()
    {
      System.out.println("Collect money even for cover we give");
    }
  }
	public static void main (String[] args) throws java.lang.Exception
	{
	GUVI g=new GUVI();
      g.set();
	}
}
