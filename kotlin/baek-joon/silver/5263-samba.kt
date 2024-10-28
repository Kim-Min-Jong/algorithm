import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val map = hashMapOf<Int, Int>()

    repeat(n) {
        val num = readLine().toInt()
        map[num] = map.getOrDefault(num, 0) + 1
    }

    bw.write("${map.filterNot { it.value % k == 0 }.keys.first()}")


    bw.flush()
    bw.close()
    close()
}