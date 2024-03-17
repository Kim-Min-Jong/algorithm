import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Int>()
    var result = 0L

    repeat(n) {
        list.add(readLine().toInt())
    }

    list.sort()

    list.forEachIndexed { idx, num ->
        result += abs(num - (idx + 1)).toLong()
    }

    bw.write("$result")

    bw.flush()
    bw.close()
    close()
}