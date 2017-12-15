//Given an array of integers, every element appears twice except for one. Find that single one
import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int A[]={1,1,2};
int x = 0;
for (int a : A) {
x = x ^ a;
}
System.out.println(x);
	}
}
