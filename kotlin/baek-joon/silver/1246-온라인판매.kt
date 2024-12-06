import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val list = mutableListOf<Int>()
    var price = 0
    var profit = 0

    repeat(m) {
        list.add(readLine().toInt())
    }
    list.sort()

    for (i in 0 until m) {
        val cnt = min(n, m - i)
        
        if (profit < list[i] * cnt) {
            price = list[i]
            profit = list[i] * cnt
        }
    }
    
    bw.write("$price $profit")

    closeBW()
    close()
}