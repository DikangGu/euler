object P12 {
	    
	def numOfFactors(num: BigInt) :Int = {
		var count = 0                 
		
		for (i <- (BigInt(1) to num)) {
			if (num % i == 0) {
				count = count + 1
			}
		}
		
		count
	}
	
	def main(args: Array[String]) {
		var triangle = BigInt(1)
		var index = BigInt(2)
		
		while(true) {
			triangle = triangle + index
			
			if (triangle > BigInt(5000000)) {
				val factors = numOfFactors(triangle)     
				println(factors)
				if (factors > 500) {
					println(triangle)
					return
				}
			}
			
			index = index + BigInt(1)
		}
		
		
	}
}