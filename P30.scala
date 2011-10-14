               
object P30 {
	
	def fifthPower(num: Int): Boolean = {
		var sum:Int = 0;
		var t = num;
		while (t > 0) {
			sum = sum + math.pow(t%10, 5).asInstanceOf[Int];
			t = t /10;
		}             
		
		if (sum == num) {
			true
		} else {
			false
		}
	}
	
	def main(args: Array[String]) {
		var sum = 0
		for (i <- 2 to 1000000) {    
			if (fifthPower(i)) {
				println(i)
				sum = sum + i
			}
		}                    
		
		println(sum)
	}
}