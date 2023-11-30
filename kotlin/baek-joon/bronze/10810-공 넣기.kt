import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{ it.toInt() }
    val arr = IntArray(n) { 0 }
    repeat(m) {
        val (from, to, number) = readLine().split(" ").map{ it.toInt() - 1 }
        for(i in from..to) {
            arr[i] = number + 1
        }
    }

    arr.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
    close()

}