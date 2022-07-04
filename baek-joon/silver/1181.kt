import java.util.*
import java.io.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var pList = mutableSetOf<String>()
    var mu = mutableListOf<String>()
    repeat(n) {
        pList.add(readLine())
    }
    mu  = pList.toMutableList().apply {
        sortWith(Comparator { a, b ->
            if (a.length == b.length) a.compareTo(b)
            else a.length - b.length
        })
    }

    for (i in mu) {
        bw.write("${i}\n")
    }

    bw.flush()
    bw.close()
    this.close()
}