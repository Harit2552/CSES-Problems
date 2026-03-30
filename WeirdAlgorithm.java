import java.util.*;
import java.lang.*;
import java.io.*;

public class WeirdAlgorithm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.print(n + " ");
		
		while (n > 1) {
		    if (n % 2 == 0) n /= 2;
		    else n = n * 3 + 1;
		    System.out.print(n + " ");
		}

	}
}
