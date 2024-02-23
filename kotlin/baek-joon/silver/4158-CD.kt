import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        val (n, m) = readLine().split(" ").map { it.toInt() }
        if(n == 0 && m == 0) break
        val list1 = mutableListOf<Int>()
        val list2 = mutableListOf<Int>()

        repeat(n) {
            list1.add(readLine().toInt())
        }
        repeat(m) {
            list2.add(readLine().toInt())
        }
        bw.write("${list1.intersect(list2.toSet()).size}\n")
    }

    bw.flush()
    bw.close()
    close()
}
