import java.util.*;
import java.lang.*;
import java.io.*;

public class MissingNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long sum = 0;
		
        // String[] input = br.readLine().split(" ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n - 1; i++) {
            sum += Integer.parseInt(st.nextToken());
        }
        
        long total = (long)n * (n + 1) / 2;
		
		System.out.print(total - sum);
	}
}
