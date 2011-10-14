object P36 {
	        
	def isPalindromicStr(str: String): Boolean = {  
		var len = str.length
		
		(0 until len/2).foreach((x) => {
			if (str.charAt(x) != str.charAt(len-x-1)) {
				return false
			}
		})
		                   
		true
	}
	
	def isPalindromic10(num: Int): Boolean = {
		var str = num.toString
		    
		isPalindromicStr(str)
	}           
	
	def isPalindromic2(num: Int): Boolean = {
		                                
		var str = ""   
		var t = num
		while(t > 0) {
			if (t % 2 == 0) {
				str = "0" + str
			} else {
				str = "1" + str
			}                  
			t = t / 2
		}                   
		println(str)
		       
		isPalindromicStr(str)
	}
	
	def main(args: Array[String]) {
		                              
		var sum = 0
		(0 until 1000000).foreach((x) => {
			if (isPalindromic10(x)) {
				if(isPalindromic2(x)) {
					sum = sum + x
				}
			}
		})                       
		
		println(sum)
		
	}
}