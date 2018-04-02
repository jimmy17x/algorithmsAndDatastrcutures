package maths;

public class FundamentalTheoremOfArithmetics {
	
	public static void main(String[] args) {
		
		int a = 16457 ,  b = 1638;
		
		System.out.println( calculateGCDUsingEuclideanAlgoBySubtraction(a,b) ); // answer is 7
		System.out.println( calculateGCDUsingEuclideanAlgoByDivision(a,b) );
		
		
	}

	// basic euclidean algorithm using subtraction  
	// O (Log min(a,b))
	private static int calculateGCDUsingEuclideanAlgoBySubtraction( int a , int b ) {
		
		if(a==b)
			return a ;
		if(a==0 && b ==0)
			return  0;
		
		if(a > b )
			return calculateGCDUsingEuclideanAlgoBySubtraction(a-b,b);
		else
			return calculateGCDUsingEuclideanAlgoBySubtraction(a,b-a);
		
		
	}
	
	// here a >= b  
	// basic euclidean algorithm using division O (Log min(a,b))
	private static int calculateGCDUsingEuclideanAlgoByDivision( int a , int b ) {
			if(b==0)
				return a; // remainder is 0 , hence return a 
			
			return calculateGCDUsingEuclideanAlgoByDivision(b,a%b);	
		}
	
	
	
	

}
