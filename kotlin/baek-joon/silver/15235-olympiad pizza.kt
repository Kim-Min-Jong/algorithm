import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }.toMutableList()
    var time = 0
    val res = IntArray(n) { 0 }
    var idx = 0

    while (list.all { it == 0 }.not()) {
        idx %= n
        if (list[idx] != 0) {
            list[idx]--
            time++
        }
        if (list[idx] == 0 && res[idx] == 0) {
            res[idx] = time
        }
        idx++

    }

    res.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
    close()
}