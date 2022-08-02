import java.util.*
import java.io.*
import kotlin.math.round

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val list = readLine().split(" ").map{it.toInt()}
    val list2 = mutableSetOf<Int>()
    for(i in list){
        if(isPrime(i)){
            list2.add(i)
        }
    }
    if(list2.isEmpty()){
        bw.write("-1\n")
    }else{
        var lcm = 1L

        for(i in list2){
            lcm *= i
        }
        bw.write("$lcm\n")
    }

    bw.flush()
    bw.close()
    this.close()
}
fun isPrime(n:Int):Boolean{
    if(n == 1)
        return false
    if(n == 2)
        return true
    for(i in 2..Math.sqrt(n.toDouble()).toInt())
        if(n % i == 0)
            return false
    return true
}