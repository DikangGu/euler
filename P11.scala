import java.util.Scanner;      
import java.io.FileInputStream;

object P11 {  
	
	def product(i:Int, j:Int, data:Array[Array[Int]]) :Int = {
	    var product = 0    
		//right 
		if (j < 17) {      
			val t = data(i)(j) * data(i)(j+1) * data(i)(j+2) * data(i)(j+3)
			if (product < t) product = t
		}                               
		
		// down
		if (i < 17) {
			val t = data(i)(j) * data(i+1)(j) * data(i+2)(j) * data(i+3)(j)
			if (product < t ) product = t
		}                                
		
		// diagonally
		if (i<17 && j<17) {
			val t = data(i)(j) * data(i+1)(j+1) * data(i+2)(j+2) * data(i+3)(j+3)
			if (product < t) product = t
		}                               
		
		if (i<17 && j>3) {
			val t = data(i)(j) * data(i+1)(j-1) * data(i+2)(j-2) * data(i+3)(j-3)
			if (product < t) product = t
		}
	
		product
	}
	
	def main(Args: Array[String]) {    
		val data = Array.ofDim[Int](20, 20)
		var i = 0
		var j = 0
		
		
		
		val sc = new Scanner(new FileInputStream("/tmp/P11.input"))
		
		i=0;
		j = 0;
		
		while(sc.hasNext()) {
			i = i + j/20;
			j = j % 20;
			
			data(i)(j) = sc.nextInt();     
			j = j + 1
		}
	            
		var maxProduct = 0;
	    for (i <- (0 to 19)) {
			for (j <- (0 to 19)) {
				           
				val t = product(i, j, data)
				if (maxProduct < t) maxProduct = t
				
				print(data(i)(j)) 
				print(",")
			}           
			println()
		} 
		                                          
		println(maxProduct)
	}
}