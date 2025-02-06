import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.HashMap
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map = hashMapOf<Int, Int>()

    readLine().split(" ").map { it.toInt() }.forEachIndexed { index, i ->
        map[i] = index 
    }

    val next = readLine().split(" ").map { it.toInt() }.also{
        it.forEachIndexed { index, i ->
            map[i] = map[i]!! - index - 1
        }
    }

    val list = map.toList()
    val max = list.maxBy { it.second }.second
    val end = list.filter { it.second == max }.map { it.first }

    for (i in 0 until n) {
        if (next[i] in end) {
            bw.write("${next[i]} ")
        }
    }

    closeBW()
    close()
} // 좀더 보기...