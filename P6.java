public class P6 {
	
	public static void main(String[] args) {     
		
		int squaresOfNums = 0;
		for (int i=1; i<=100; i++) {
			squaresOfNums += i*i;
		}                        
		
		System.out.println(5050*5050 - squaresOfNums);
		
	}
}