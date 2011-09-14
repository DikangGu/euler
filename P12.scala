object P12 {
	    
	def numOfFactors(num: Long) :Int = {
		var count = 0                 
		
		for (i <- (1L to num)) {
			if (num % i == 0) {
				count = count + 1
			}
		}
		
		count
	}
	
	def main(args: Array[String]) {
		var triangle = 1L
		var index = 2
		
		while(true) {
			triangle = triangle + index
			
			if (triangle > 500000000) {
				val factors = numOfFactors(triangle)     
				println(factors)
				if (factors > 500) {
					println(triangle)
					return
				}
			}
			
			index = index + 1
		}
		
		
	}
}