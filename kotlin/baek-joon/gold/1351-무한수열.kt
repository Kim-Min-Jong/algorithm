import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var map: HashMap<Long, Long>
fun main() = with(System.`in`.bufferedReader()) {
    val (n, p, q) = readLine().split(" ").map { it.toLong() }
    map = hashMapOf(0L to 1L)
    bw.write("${dp_hash(n, p, q)}")

    bw.flush()
    bw.close()
    close()

}
fun dp_hash(n: Long, p:Long, q: Long): Long {
    if(n in map) {
        return map[n]!!
    }
    map[n] = dp_hash(n/p, p, q) + dp_hash(n/q, p, q)
    return map[n]!!
}