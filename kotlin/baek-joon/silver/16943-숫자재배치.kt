import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
       val (n, m) = readLine().split(" ").map{it.toInt()}
    val numList = n.toString().chunked(1).map{it.toInt()}
    val permutation = permutation(numList)
    val list = mutableListOf<String>()
    permutation.forEach {
        list.add(it.joinToString(""))
    }
    var res = -1
    for(item in list) {
        if(item[0] == '0') continue
        val tmp = item.toInt()
        if(tmp < m)
            res = res.coerceAtLeast(tmp)
    }
    bw.write("$res")


    bw.flush()
    bw.close()
    close()
}
fun <T> permutation(el: List<T>, fin: List<T> = listOf(), sub: List<T> = el): List<List<T>> {
    return if (sub.isEmpty()) listOf(fin)
    else sub.flatMap { permutation(el, fin + it, sub - it) }
}