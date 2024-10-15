import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    var (n, m) = readLine().split(" ").map { it.toInt() }
    val list = mutableListOf<Int>()
    var count = 0
    repeat(m) {
        list.add(readLine().toInt())
    }

    list.sorted().forEach {
        if (n - it < 0) return@forEach
        n -= it
        count++
    }

    bw.write("$count")
    
    bw.flush()
    bw.close()
    close()
}