                                   
object P48 {
	
	def main(args: Array[String]) {
	
		var result = BigInt(0)
		
		(1 until 1001).foreach((x) => {
			var t = BigInt(x)
			result = result + t.pow(x)
		})                   
		
		println(result)
	}
}