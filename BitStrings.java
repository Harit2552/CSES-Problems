import java.util.*;

public class BitStrings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int mod = (int)1e9 + 7;
        
		long count = 1L;
		
		while (n > 0) {
		    count <<= 1;
		    count %= mod;
		    n--;
		}
		
		System.out.println(count);

        sc.close();
	}
}
