import java.util.Scanner                                   
import java.io.FileInputStream                  
import scala.collection.mutable.ListBuffer

object P22 {
	
	def main(args: Array[String]) {
		var sc = new Scanner(new FileInputStream("names.txt"))useDelimiter("\",*\"*")
		
	    var listBuf = new ListBuffer[String]()
	
		while (sc.hasNext) {
			listBuf += sc.next()
		}          
		
		var list = listBuf.toList.sortWith((e1, e2) => (e1 < e2))
		
		println(list.length)        
		println(list.head)                       
		  
	   // var result = list.foldLeft(0) {(x, y) => {
	   // 	var t = 0 
	   // 	(0 until y.length).foreach((z) => {
	   // 		t = t + (y.charAt(z) - 'A') + 1    
	   // 	})                
	   // }}       
		var array = list.toArray
		var result = 0
		(0 until array.length).foreach((x) => {
			var y = array(x)   
			var t = 0 
		   	(0 until y.length).foreach((z) => {
	       		t = t + (y.charAt(z) - 'A') + 1    
   	    	})        
			result = result + (t * (x+1))
		})
		
		println (result)
	}
}