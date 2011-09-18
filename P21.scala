object P21 {
	    
	def divisors(num: Int): Int = {
		
		(1 until num).foldLeft(0) {
			(x, y) => x + (if (num % y == 0) y else 0)
		}
	}    
	
	def amicable(num: Int): Int = {
		var div = divisors(num)     
		if (div != num && div < 10000) {
			var tdiv = divisors(div)
			if (tdiv == num)
				return num
		}          
		
		0
	}
	
	def main(args: Array[String]) { 
		var result = (2 until 10000).foldLeft(0) {
			(x, y) => x + amicable(y)
		}   
		
		println(result)
	}
}