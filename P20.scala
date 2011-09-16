object P20 {
	
	def main(args: Array[String]) {
		var fractorial = BigInt(1) 
		for (i <- (1 to 100)) {
			fractorial = fractorial * i
		}                              
		
		println(fractorial)         
		var sum = 0     
		var str = fractorial.toString()
		(0 until str.length).foreach((x) => {
			sum = sum + (str.charAt(x) - '0')
		})                                                   
		
		println(sum)
	}
}