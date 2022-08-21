import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){

    val (a, b, c) = readLine().split(" ").map{it.toInt()}
    var cnt = 0
    for(i in a..b){
        if(isPrime(i) && i.toString().contains(c.toString())){
            cnt++
        }
    }
    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
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