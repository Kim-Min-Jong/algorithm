import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.lang.Math.abs
import java.util.*


val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, tc) = readLine().split(" ").map{it.toInt()}
    val list = readLine().split(" ").map{it.toInt()}
    repeat(tc) {
        val (a, b) = readLine().split(" ").map{it.toInt()}
        if(a == b) bw.write("0\n")
        else {
            var sum = 0
            for (i in a until b) {
                sum += abs(list[i] - list[i - 1])
            }
            bw.write("$sum\n")
        }
    }
    bw.flush()
    bw.close()
    close()
}