//Average of an array element.
import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Integer> al = new ArrayList<Integer>(3);
al.add(10);
al.add(15);
al.add(20);
int total = 0;
int avg=0;
for(int i = 0; i < al.size(); i++)
{
    total += al.get(i);
    avg = total / al.size();
    
}
System.out.println(avg);


	}
}
