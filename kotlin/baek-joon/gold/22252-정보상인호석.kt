import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map = hashMapOf<String, PriorityQueue<Int>>()
    var answer = 0L
    for (i in 0 until n) {
        val input = readLine().split(" ")
        val command = input[0].toInt()
        val name = input[1]
        var cnt = input[2].toInt()

        if (command == 1) {
            val values = PriorityQueue<Int>(Collections.reverseOrder()).apply {
                input.subList(3, input.size).forEach {
                    add(it.toInt())
                }
            }
            if (map.containsKey(name).not()) {
                map[name] = values
            } else {
                map[name]!!.addAll(values)
            }
        } else {
            val info = map[name] ?: continue
            if (info.size <= cnt) {
                repeat(info.size) { answer += info.poll() }
            } else {
                repeat(cnt) { answer += info.poll() }
            }
        }
    }

    bw.write("$answer")

    closeBW()
    close()
}