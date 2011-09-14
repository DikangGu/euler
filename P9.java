public class P9 {
	public static void main(String[] args) { 
		
		for (int i=3; i<500; i++) {
			for (int j=i+1; i+j <700; j++) {
				for (int k=j+1; i+j+k<=1000; k++) {
					if (i*i + j*j == k*k && i+j+k==1000) { 
						System.out.println(i + "," + j + "," + k);
						System.out.println(i*j*k);
						return;
					}
				}
			}
		}
	}
}