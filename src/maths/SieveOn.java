package maths;

import java.util.ArrayList;
import java.util.Arrays;

public class SieveOn {
	
	public static void main(String[] args) {
		
		System.out.println(sieve(13));
	}

	private static ArrayList<Integer> sieve(int n) {
		
		ArrayList<Integer> prime = new ArrayList() ;
		boolean isPrime [] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		int SPF  [] =  new int[n+1];
		
		
		for(int i = 2 ; i <= n; ++i)
		{
			if(isPrime[i])
			{
				prime.add(i);
				SPF[i] = i ; // a prime number is smallest prime of itself
			}
			
			// this condition will run only once for each number which is not prime
			for( int j = 0 ; j < prime.size() && i * prime.get(j) <= n && prime.get(j) <= SPF[i]  ; ++j )
			{
				SPF[i*prime.get(j)] = prime.get(j) ;
				isPrime[ i*prime.get(j)] = false;
			}
		}
		
		
		return prime;
		
		
	}

}
