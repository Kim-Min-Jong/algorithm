import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.min

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{it.toInt()}
    val list = mutableListOf<Int>()

    var right = 0
    var res = Int.MAX_VALUE
    repeat(n) {
        list.add(readLine().toInt())
    }
    list.sort()
    for(i in 0 until list.size) {
        while(right < list.size) {
            val diff = list[right] - list[i]
            if(m <= diff) {
                res = min(res, diff)
                break
            } else right++
        }

    }
    bw.write("$res")

    bw.flush()
    bw.close()
    close()
}