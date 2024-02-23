import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        var (candy, box) = readLine().split(" ").map { it.toInt() }
        val sizeList = mutableListOf<Int>()
        var cnt = 0
        repeat(box) {
            val (r, c) = readLine().split(" ").map { it.toInt() }
            sizeList.add(r * c)
        }
        sizeList.sortDescending()
        for (i in 0 until sizeList.size) {
            candy -= sizeList[i]
            cnt++
            if(candy < 1) {
               break
            }
        }
        bw.write("$cnt\n")
    }

    bw.flush()
    bw.close()
    close()
}