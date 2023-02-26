import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map{ it.toInt() }.sorted()
    var cnt = 1
    for(i in list) {
        if(cnt < i) break
        cnt += i
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}