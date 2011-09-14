public class P4 {
	    
	private static boolean isPalindromic(int num) {
		String str = String.valueOf(num);
		int i=0;
		int j=str.length() - 1;
		
		while (i<j) {
			if (str.charAt(i) != str.charAt(j)) return false;
			
			i++;
			j--;
		}       
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int max=1;
		
		for (int i=100;i<1000;i++) {
			for (int j=100;j<1000;j++) {
				int num = i*j;
				if (isPalindromic(num)) {
					if (max < num) max = num;
				}
			}
		}                                    
		
		System.out.println(max);
		
	} 
}