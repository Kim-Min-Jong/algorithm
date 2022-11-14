import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = IntArray(n*n){0}

    for(i in 0 until n) {
        val tmpArr = readLine().split(" ").map{it.toInt()}
        for(j in 0 until n) {
            arr[j + (n * i)] = tmpArr[j]
        }
    }
    bw.write("${arr.sortedArrayDescending()[n-1]}")

    bw.flush()
    bw.close()
    close()
}