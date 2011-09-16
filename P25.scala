object P25 {
	
	def main(args: Array[String]) {
		var a = BigInt(1)
		var b = BigInt(1)
		var c = a + b 
		var index = 3
		while (c.toString.length < 1000) {
			a = b;
			b = c;
			c = a + b;
			index = index + 1     
			println(c)
		}
		println(c)
		println(index)
		
	}
}