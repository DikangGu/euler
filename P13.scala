import java.util.Scanner
import java.io.FileInputStream


object P13 {
	def main(args: Array[String]) {

		val sc = new Scanner(new FileInputStream("/tmp/P13.input")) 
		
		var sum = BigInt(0)
		
		while (sc.hasNext()) {
			val t = BigInt(sc.nextLine())
			sum = sum + t;
		}                 
		
		println(sum)

	}
}