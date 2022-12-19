import java.util.*

fun main() = with(Scanner(System.`in`)){
        var a = nextInt()
        var b = nextInt()
        for(i in a..b){
                if(isPrime(i))
                        println(i)
        }

}
fun isPrime(num:Int):Boolean{
        if(num <= 1) return false
        return (2..Math.sqrt(num.toDouble()).toInt()).none{ num % it == 0 }
}