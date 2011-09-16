object P24 {    
	
	def nextPermutation(nums: Array[Int]) : Array[Int] = {
		for (k<- (0 to nums.length-2)) {
			var i = nums.length-2 -k
			if (nums(i) < nums(i+1)) {        
				
				var max = nums(i+1)
				var maxIndex = i + 1
				for (j<- (i+2 to nums.length -1)) {
					if (nums(j) > nums(i) && max > nums(j)) {
						max = nums(j)
						maxIndex = j
					}
				}                   
				
				var t = nums(i)
				nums(i) = max
				nums(maxIndex) = t
				
				for (j<- (i+1 to nums.length-1)) {
					for (k<- (j+1 to nums.length - 1)) {
						if (nums(j) > nums(k)) {
							t = nums(j)
							nums(j) = nums(k)
							nums(k) = t
						}
					}
				}  
				
				return nums
			}
		}   
		
		nums
	}    
	
	def main(args: Array[String]) {  
		var list = List[Int](0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
		var nums = list.toArray
		
		(0 until 999999).foreach((x) => {   
			nums = nextPermutation(nums)
		})     
		(0 until nums.length).foreach((y) => {
			print(nums(y))
		})                
		println()
		
	}
}