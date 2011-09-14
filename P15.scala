                                   
// C 40, 20
object P15 {
	
	def main(args: Array[String]) {
		var result = BigInt(40)
		
		for (i <- (21 to 39)) {
			result = result * i
		}                      
		
		for (i <- (1 to 20)) {
			result = result / i
		}                      
		
		println(result)
		
	}
}