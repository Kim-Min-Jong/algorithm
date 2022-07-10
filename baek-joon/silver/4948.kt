import java.util.*

fun main() = with(Scanner(System.`in`)){
        while(true) {
                val n = nextInt()
                var cnt = 0
                for (i in n + 1..2 * n) {
                        if (isPrime(i))
                                cnt++
                }
                if(n == 0) break
                println(cnt)

        }
}
fun isPrime(num:Int):Boolean{
        if(num <= 1) return false
        return (2..Math.sqrt(num.toDouble()).toInt()).none{ num % it == 0 }
}
