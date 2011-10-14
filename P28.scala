object P28{                           
	
	def spiralMatrix(n: Int): Array[Array[Int]] = {
		                                    
		var matrix = Array.ofDim[Int](n, n) 
		var cx = (n-1)/2
		var cy = cx
		
		matrix(cx)(cy) = 1
		var startx = cx - 1
		var starty = cy + 1
		var start = 1
		
		var count = 1
	    var t = 3 
		while (count < n*n) { 
			
			(1 until t).foreach((x) => {
				if (count < n*n) {
					startx = startx + 1
					start = start + 1
					matrix(startx)(starty) = start
					count = count + 1 
				}     
			})    
			
			(1 until t).foreach((x) => {      
				if (count < n*n) {
					starty = starty - 1
					start = start + 1
					matrix(startx)(starty) = start
					count = count + 1
				}
			})
			
			(1 until t).foreach((x) => {      
				if (count < n*n) { 
					startx = startx - 1
					start = start + 1
					matrix(startx)(starty) = start
					count = count + 1
				}
			})
			
			(1 until t).foreach((x) => {      
				if (count < n*n) {
					starty = starty + 1
					start = start + 1
					matrix(startx)(starty) = start  
					count = count + 1
				}
			})                     
			
			t = t + 2         
			//println(count) 
			starty = starty + 1 
			startx = startx - 1
		}
		
		
		
		matrix
	}
	
	def main(args: Array[String]) {         
		var n = 1001   
		
		var matrix = spiralMatrix(n)     
		var sum = 0
		(0 until n).foreach((x) => {
			sum = sum + matrix(x)(x)
			sum = sum + matrix(x)(n-1-x)
		})                             
		
		println(sum - 1)
		
		/*
		(0 until n).foreach((x) => {
					(0 until n).foreach((y) => {
						print(matrix(x)(y))
						print("\t")
					})          
					println()
				}) */
		
	}
}