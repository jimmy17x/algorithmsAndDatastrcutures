package maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SieveOfErathothenes {
	
	public static void main(String[] args) {
		
		System.out.println(SieveOfErastothenesNloglogn(30));
		System.out.println(SieveOfErastothenesOn(30));
	}
	
	private static  List<Integer> SieveOfErastothenesOn(int n) {
		
		List <Integer> res = new ArrayList();
		
		return res;
	}

	// O (n log (log n) )
	private static List<Integer> SieveOfErastothenesNloglogn(int  n) {
		
		List<Integer> result = new ArrayList<>();
		boolean isPrime[] =  new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		
		for(int i = 2 ; i <= n ; ++	i)
		{
			if(isPrime[i])
			{
				for(int  j = i*2 ; j <=n ; j+=i)
				{
					isPrime[j]=false;
				}
			}
		}
		
		
		for(int i = 2 ; i <=n ; ++i )
		{
			if(isPrime[i])
				result.add(i);
		}
		
		return result;
		
	}

}
