import java.util.Scanner                                      
import java.io.FileInputStream

object P18 {
	
	def main(args: Array[String]) {
		val sc = new Scanner(new FileInputStream("P18.input"))  
		
		var count = 0       
		var start = new Array[Int](15)
		(0 until 15).foreach((x) => {
			count = count + x + 1    
			if (x>0) {
				start(x) = x + start(x-1)
			}                            
			
			println(start(x))
		})          
		
		val data = new Array[Int](count)
		         
		var i = 0
		while (sc.hasNext) {
			data(i) = sc.nextInt()
			i = i + 1
		}              
		       
		// calculate
		(1 until count).foreach((x) => {
			var t = 0
			while (t < 15 && start(t) <= x) {
				t = t + 1
			}            
			
			t = t - 1 
			         
			// the last ele
			if (x == start(t) + t) {
				data(x) = data(x-t-1) + data(x)
			} else if (x == start(t)) {
				data(x) = data(x-t) + data(x)
			} else {
				var tmp = data(x)
				data(x) = data(x-t) + tmp
				if (data(x) < data(x-t-1) + tmp) {
					data(x) = data(x-t-1) + tmp
				}
			}
		})  
		     
		// search for the max in the last line
		var max = 0
		(start(14) until count).foreach((x) => {
			if (max < data(x)) max = data(x)
		})                                 
		
		println(max)
	}
}