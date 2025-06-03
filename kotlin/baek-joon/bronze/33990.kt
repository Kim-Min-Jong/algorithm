import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Int>()

    repeat(n) {
        val sum = readLine().split(" ").map { it.toInt() }.sum()
        list.add(sum - 512)
    }

    var max = Int.MAX_VALUE



    list.forEach {
        if (it in 0 until max) {
            max = it
        }
    }

    if (list.none { it >= 0 }) {
        bw.write("-1")
    } else {
        bw.write("${max + 512}")
    }

    closeBW()
    close()
}