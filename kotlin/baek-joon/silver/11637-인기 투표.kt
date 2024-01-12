import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val m = readLine().toInt()
        val list = mutableListOf<Int>()
        repeat(m) {
            list.add(readLine().toInt())
        }
        val max = list.max()
        val isSameMax = list.count{ it == max } > 1
        val index = list.indexOf(max)
        val isHalfOver = list.sum() - max < max
        val suffix = if(isHalfOver) "majority" else "minority"
        if(isSameMax) {
            bw.write("no winner\n")
        } else {
            bw.write("$suffix winner ${index+1}\n")
        }
    }

    bw.flush()
    bw.close()
    close()
}