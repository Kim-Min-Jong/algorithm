import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.PriorityQueue

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    repeat(n) {
        val (q, k) = readLine().split(" ").map { it.toInt() }
        val pq = PriorityQueue<Int>()
        var result = 0
        repeat(q) {
            val command = readLine().split(" ")
            when(command.size) {
                1 -> {
                    bw.write("$result\n")
                }
                else -> {
                    val value = command[1].toInt()
                    if(pq.size < k) {
                        result = result xor value
                        pq.add(value)
                    } else if(pq.first() < value) {
                        // 가장 큰 숫자로 xor
                        result = result xor pq.poll()
                        result = result xor value
                        pq.add(value)
                    }
                }
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}