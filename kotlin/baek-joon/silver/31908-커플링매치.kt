import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
data class Ring(val name: String, val kind: String)

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Ring>()
    repeat(n) {
        val (name, kind) = readLine().split(" ")
        list.add(Ring(name, kind))
    }

    list.groupBy { it.kind }.map { it.key to it.value.map { ring -> ring.name }}.filter { it.first != "-" && it.second.size == 2 }.run {
        if (isEmpty()) {
            bw.write("0")
        } else {
            bw.write("$size\n")
            forEach {
                bw.write(it.second.joinToString(" ") + "\n")
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}