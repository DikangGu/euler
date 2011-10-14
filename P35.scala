import scala.collection.mutable.ListBuffer

object P35 {        
	
	def isPrime(num: Int): Boolean = {
		var prime = true
		     
		(2 until (scala.math.sqrt(num).asInstanceOf[Int] + 1).foreach((x) => { 
			if (num % x == 0)
				return false
		})
		
		prime
	}  
	
	def rotations(num: Int): List[Int] = {  
		var listBuf = new ListBuffer[Int]()
	    var str = num.toString            
	
	
	
		listBuf.toList
	}
	
	def main(args: Array[String]) {
		
		val data = new Array[Int](1000000)
		                                       
	}
}