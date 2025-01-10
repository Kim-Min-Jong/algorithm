import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val map = hashMapOf<String, Int>()
    repeat(n) {
        val (job, salary) = readLine().split(" ")
        map[job] = salary.toInt()
    }
    repeat(m) {
        var sum = 0
        while(true) {
            val str = readLine()
            if (str == ".") break
            str.split(" ").forEach {
                sum += map[it] ?: 0
            }
        }

        bw.write("$sum\n")
    }

    closeBW()
    close()
}