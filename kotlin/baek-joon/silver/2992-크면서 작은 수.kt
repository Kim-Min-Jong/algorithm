import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*


val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val num = readLine()
    val numList = num.chunked(1)
    val answer = permutation(numList)
    val res = mutableListOf<String>()
    answer.forEach {
        res.add(it.joinToString(""))
    }

    val l = res.map{it.toInt()}.sorted().toSet().toList()
    val idx = l.indexOf(num.toInt())
    try {
        bw.write("${l[idx+1]}")
    } catch (e: Exception) {
        bw.write("0")
    }
    bw.flush()
    bw.close()
    close()
}
fun <T> permutation(el: List<T>, fin: List<T> = listOf(), sub: List<T> = el): List<List<T>> {
    return if (sub.isEmpty()) listOf(fin)
    else sub.flatMap { permutation(el, fin + it, sub - it) }
}