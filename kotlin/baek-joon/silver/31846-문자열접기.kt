import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val str = readLine()
    val tc = readLine().toInt()

    repeat(tc) {
        val (l, r) = readLine().split(" ").map { it.toInt() - 1 }
        val slicedStr = str.slice(l..r)
        var max = 0

        for (i in 1 until slicedStr.length) {
            val front = slicedStr.slice(0 until i).reversed()
            val back = slicedStr.slice(i until slicedStr.length)
            val length = if(front.length > back.length) back.length else front.length
            var cnt = 0
            for (j in 0 until length) {
               if (front[j] == back[j]) cnt++
            }
            if (max < cnt) max = cnt
        }
        bw.write("$max\n")
    }


    bw.flush()
    bw.close()
    close()
}