import java.util.*

fun main() = with(Scanner(System.`in`)){
        val a = nextInt()
        val b = nextInt()
        var list = mutableListOf<Int>()
        for(i in a..b){
                if(isPrime(i)){
                        list.add(i)
                }
        }
        if(list.isEmpty()) println(-1)
        else{
                println(list.sum())
                println(list.minOrNull()!!)
        }
}
fun isPrime(num:Int):Boolean{
        if(num <= 1) return false
        return (2..Math.sqrt(num.toDouble()).toInt()).none{ num % it == 0 }
}