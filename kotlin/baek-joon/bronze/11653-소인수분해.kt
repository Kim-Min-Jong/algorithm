import java.util.*

fun main() = with(Scanner(System.`in`)){
        var n = nextInt()
    for(i in 2..Math.floor(Math.sqrt(n.toDouble())).toInt()) {	
	    while(n % i == 0) {
	    	println(i);
		    n /= i;
	    }
    }
 
    if(n != 1) {
	    println(n);
    }
}