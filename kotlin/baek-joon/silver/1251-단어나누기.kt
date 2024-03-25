import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    val list = mutableListOf<String>()
    for (i in 1 until str.length) {
        for (j in i + 1 until str.length) {
            // 자르기
            val first = StringBuilder(str.substring(0 until i))
            val second = StringBuilder(str.substring(i until j))
            val third = StringBuilder(str.substring(j))
            // 뒤집고 합치기
            val tmp = first.reverse().append(second.reverse().append(third.reverse())).toString()
            list.add(tmp)
        }
    }

    bw.write(list.minOf { it })

    bw.flush()
    bw.close()
    close()
}