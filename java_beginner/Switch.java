//Write a program called PizzaOffer which prints Offer of the day based on the input int "DayOfTheWeek"


Sunday=0,Monday=1,Tuesday=3,Wednesday=4,Thursday=5,Friday=6

Sunday :Free Personal Pizza on purchase of medium Pizza

Monday:Rs.101 OFF on a bill of Rs.400 and above

Tuesday:Free Plain Garlic Bread on another medium pizza

Wednesday:Buy 1 Get 1 Free on any medium pizza

Thursday:Buy any medium pizza and get 50% off on another medium pizza

Friday:Tastiest pizza 20% off on bill of Rs.399 or above

Saturday:Get Together Offer Free Garlic Bread and Dip on a min bill of Rs.350


For Eg:If today is Monday ,your program should output

Rs.101 OFF on a bill of Rs.400 and above

import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  int n;
  Scanner sc=new Scanner(System.in);
  public void get()
  {
    System.out.println("Enter the day of the week");
    n=sc.nextInt();
  }
  public void set()
  {
  switch(n)
  {
    case 0:
      {
        System.out.println("Sunday");
        System.out.println("Free Personal Pizza on purchase of medium Pizza");
        break;
      }
    case 1:
      {
        System.out.println("Monday");
         System.out.println("Rs.101 OFF on a bill of Rs.400 and above

");
        break;
      }
    case 2:
      {
         System.out.println("Tuesday");
         System.out.println("Free Plain Garlic Bread on another medium pizza");
        break;
      }
    case 3:
      {
         System.out.println("Wednesday");
         System.out.println("Buy 1 Get 1 Free on any medium pizza

");
        break;
      }
    case 4:
      {
         System.out.println("Thursday");
         System.out.println("Buy any medium pizza and get 50% off on another medium pizza");
        break;
      }
    case 5:
      {
         System.out.println("Friday");
         System.out.println("Tastiest pizza 20% off on bill of Rs.399 or above");
        break;
      }
    case 6:
      {
         System.out.println("Saturday");
         System.out.println("Get Together Offer Free Garlic Bread and Dip on a min bill of Rs.350");
        break;
      }
  }


    
	public static void main (String[] args) throws java.lang.Exception
	{
GUVI g=new GUVI();
      g.get();
      g.set();
      
      
	}
}
