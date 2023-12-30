import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val (n, a, b, c) = readLine().split(" ").map { it.toLong() }
    bw.write("${factorial(n) / (factorial(a) * factorial(b) * factorial(c))}")
    bw.flush()
    bw.close()
    close()
}
tailrec fun factorial(n: Long, run: Long = 1L): Long = if (n == 1L) run else factorial(n - 1, run * n)