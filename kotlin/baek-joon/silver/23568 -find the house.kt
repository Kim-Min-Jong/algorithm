import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map = hashMapOf<Int, Pair<String, Int>>()

    repeat(n) {
        val (position, direction, step) = readLine().split(" ")
        map[position.toInt()] = direction to step.toInt()
    }

    var now = readLine().toInt()

    repeat(n) {
        when(map[now]!!.first) {
            "R" -> now += map[now]!!.second
            "L" -> now -= map[now]!!.second
        }
    }

    bw.write("$now")

    bw.flush()
    bw.close()
    close()
}