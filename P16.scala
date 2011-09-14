                                         
object P16{
	def main(args: Array[String]) {
		var result = BigInt(2) 
		result = result.pow(1000)
		                       
		var sum = 0       
		var str = result.toString
		(0 until str.length).foreach((x) => {
			sum = sum + (str.charAt(x) - '0')
		})                                      
		
		println(sum)
	}
}