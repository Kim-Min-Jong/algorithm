import java.util.*

fun main() = with(Scanner(System.`in`)){
        val n = nextInt()
        var cnt = 0
        repeat(n){
                val a = nextInt()
                if(isPrime(a)){
                        cnt++
                }
        }
        println(cnt)
}
fun isPrime(num:Int):Boolean{
        if(num <= 1) return false
        return (2..Math.sqrt(num.toDouble()).toInt()).none{ num % it == 0 } 
}