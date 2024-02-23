import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs
import kotlin.math.round

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Position>()
    var res = 0L
    repeat(n) {
        val (x, y) = readLine().split(" ").map { it.toLong() }
        list.add(Position(x, y))
    }
    list.add(list[0])

    for (i in 0 until list.size - 1) {
        res += list[i].x * list[i+1].y
        res -= list[i].y * list[i+1].x
    }
    bw.write(String.format("%.1f", abs(res) / 2.0))

    bw.flush()
    bw.close()
    close()
} //  신발끈 공식 활용
data class Position(val x: Long, val y: Long)