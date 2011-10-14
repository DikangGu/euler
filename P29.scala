import scala.collection.immutable.HashSet

object P29 {
	
	def main(args: Array[String]) {
		val a = 100
		val b = 100
		
		var set = HashSet[BigInt]()
		
		(2 until a + 1).foreach((x) => {
			(2 until b + 1).foreach((y) => {
				val ba = BigInt(x)
				set += ba.pow(y)
			})
		})                     
		
		println(set.size)
		
	}
}