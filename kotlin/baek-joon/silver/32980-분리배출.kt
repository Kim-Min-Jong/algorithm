import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.min

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<String>()
    repeat(n) {
        list.add(readLine())
    }

    val keys = listOf('P', 'C', 'V', 'S', 'G', 'F')
    val values = readLine().split(" ").map { it.toInt() }
    val o = readLine().toInt()
    val map = hashMapOf<Char, Int>().apply {
        keys.zip(values).forEach {
            put(it.first, it.second)
        }
        put('O', o)
    }

    var answer = 0L
    list.forEach { trash ->
        val trashGroup = trash.groupBy { it }.map { it.key to it.value.size }
        if (trashGroup.size == 1) {
            val recyclable = map[trashGroup.first().first]!! * trashGroup.first().second
            val normal =  trash.length * o
            answer += min(recyclable, normal)
        } else {
            answer += trash.length * o
        }
    }

    bw.write("$answer")

    closeBW()
    close()
}