import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.lang.Math.pow
import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    for(i in 0 until n) {
        var x = readLine().toLong()
        while(true) {
            if(isPrime(x)) {
                bw.write("$x\n")
                break
            }
            else {
                x++
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}

fun isPrime(x: Long):Boolean {
    val sqrt = sqrt(x.toDouble()).toLong()
    if(x == 0L || x == 1L)
        return false
    for(i in 2 until sqrt+1){
        if(x % i == 0L)
            return false
    }
    return true
}

// 정수 범위를 잘 기억하자...