public class P3{
	    
	private static boolean isPrime(long num) {
		     
		boolean isPrime = true;
		for (long i=2; i<=Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}             
		
		return isPrime;
	}
	
	public static void main(String[] args) {
		
		long maxPrime = 1;
		long n = 600851475143L; 
		
		for (long i=(long)Math.sqrt(n); i>=2; i--) {
			if (n%i ==0) {
				
				if (isPrime(i)) {
					if (maxPrime < i) maxPrime = i;
				} 
				
				if (isPrime(n/i)) {
					if (maxPrime < n/i) maxPrime = n/i;
				}
			}
		}                    
		
		System.out.println(maxPrime);
	}
}