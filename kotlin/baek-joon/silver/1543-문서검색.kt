import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    var doc = readLine()
    val word = readLine()
    var cnt = 0
    while(doc.contains(word)) {
        doc = doc.replaceFirst(word, "!")
        cnt++
    }
    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
} 
// replace만 알면 풀 수 있는 쉬운 문제