/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] data = {1,2,3,4,5,6,7,8,9,10};
		double total = 0;
		
		for(int i=0;i<data.length;i++)
			total += (double)data[i];
		
		System.out.println(total/data.length);
	}
}
