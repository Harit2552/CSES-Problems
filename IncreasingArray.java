import java.util.*;
import java.lang.*;
import java.io.*;

public class IncreasingArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
		    num[i] = sc.nextInt();
		}
		    
		long oper = 0;
		for (int i = 1; i < n; i++) {
		    if (num[i - 1] <= num[i]) continue; 
		    int diff = num[i - 1] - num[i];
		    oper = oper + diff;
		    num[i] = num[i - 1];
		}
		
		System.out.println(oper);
	}
}
