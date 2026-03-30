import java.util.*;
import java.lang.*;
import java.io.*;

public class Repetitions
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int n = s.length();
		
		int max = 0;
		
		int j = 0;
		
		for (int i = 0; i < n; i++) {
		    if (s.charAt(i) != s.charAt(j)) {
		        max = Math.max(max, i - j);
		        j = i;
		    }
		}
		
		max = Math.max(max, n - j);
		
		System.out.print(max);
	}
}

