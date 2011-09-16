import scala.collection.mutable.ListBuffer        
import scala.collection.immutable.HashSet                    
                               
object P23 {
	
	def isAbundant(num: Int) : Boolean = {
		                
		var sum = 0;
		for (i<- (1 to num - 1)) {
			if (num % i == 0) {
				sum = sum + i
			}
		}                    
		
		sum > num
	}   
	
	def main(args: Array[String]) {        
		var listBuf = new ListBuffer[Int]()
		
		for (i <- (1 to 28123)) {
			if (isAbundant(i)) {
				listBuf += i
			}
		}                   
		
		var an = listBuf.toList.toArray
		
		//(0 until an.length).foreach((x) => {println(an(x))}) 
		                                               
		// the integers can be written as the sum of two abundant numbers
		var set = new HashSet[Int]()
		for (i <- (0 to an.length - 1)) {
			for (j <- (0 to an.length - 1)) {
				var sum = an(i) + an(j)
				if (sum <= 28123) {
					set += sum
				}
			}
		}                     
		
		var result = set.foldLeft(0) {(x, y) => x + y} 
		
		var t = (1 to 28123).foldLeft(0) {(x, y) => x + y} - result
		println (t)
	}
}