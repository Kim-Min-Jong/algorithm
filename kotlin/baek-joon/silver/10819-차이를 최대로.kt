import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.abs

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }

    val permutation = permutation(list)
    var max = 0

    permutation.forEach { perList ->
        var sum = 0
        for (i in 0 until n - 1) {
            sum += abs(perList[i] - perList[i + 1])
        }
        if (sum > max) max = sum
    }

    bw.write("$max")

    bw.flush()
    bw.close()
    close()
}
fun <T> permutation(el: List<T>, fin: List<T> = listOf(), sub: List<T> = el): List<List<T>> {
    return if (sub.isEmpty()) listOf(fin)
    else sub.flatMap { permutation(el, fin + it, sub - it) }
}
