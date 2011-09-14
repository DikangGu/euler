import scala.collection.mutable.HashMap

object P14 {
	    
	val solvedChain: HashMap[Long, Long] = new HashMap[Long, Long]
	
	def chain(num: Long) : Long = {      
		if (num == 1) {
			1   
	   } else if (solvedChain contains num) {
			solvedChain(num)
	   } else {
			//println(num)
			var count = 0;  
			var x = num       
			while(x%2 == 0) {
				x = x / 2
				count = count + 1
			}                
			
			if (x == 1) {
				solvedChain(num) = count + 1
				count + 1
			} else {
				val t = chain(x*3 + 1) + count + 1
				solvedChain(num) = t
				t
			}
		}
	}
	
	def main(args: Array[String]) {
		var max = 0L         
		var maxStarting = 0L
		for (i <- (1L to 1000000L))  {
			val t = chain(i)
			if (max < t)  {
				max = t
				maxStarting = i
		    }
		   // println(chain(i))
		}                       
		println(maxStarting)
	}
}