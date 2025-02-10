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
    val k = readLine().toInt()
    val list = mutableListOf<Int>()
    var res = 0
    repeat(n) {
        list.add(readLine().toInt())
    }

    list.sort()

    val pivot = list.takeLast(k)

    for (i in list.size - k - 1 downTo 0) {
        if (list[i] == pivot.min()) res++
        else break
    }

    bw.write("${res + pivot.count()}")

    closeBW()
    close()
}