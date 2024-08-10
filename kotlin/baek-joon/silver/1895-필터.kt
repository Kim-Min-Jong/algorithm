import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (r, c) = readLine().trim().split(" ").map { it.toInt() }
    val list = mutableListOf<List<Int>>()

    repeat(r) {
        list.add(readLine().trim().split(" ").map { it.toInt() })
    }

    val t = readLine().trim().toInt()
    val medians = mutableListOf<Int>()

    for (i in 0 until r - 2) {
        for (j in 0 until c - 2) {
            val tmp = mutableListOf<Int>()
            for (k in i until i + 3) {
                for (l in j until j + 3) {
                    tmp.add(list[k][l])
                }
            }
            tmp.sort()
            medians.add(tmp[4])
        }
    }

    bw.write("${medians.count { it >= t }}")

    bw.flush()
    bw.close()
    close()
}