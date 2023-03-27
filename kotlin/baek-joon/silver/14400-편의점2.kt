import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.abs

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val tc = readLine().toInt()
    val dots = mutableListOf<Node>()
    repeat(tc) {
        val dot = readLine().split(" ").map{ it.toInt() }
        dots.add(Node(dot[0],dot[1]))
    }
    dots.sortBy { it.x }
    val midX = dots[(tc-1)/2].x

    dots.sortBy { it.y }
    val midY = dots[(tc-1)/2].y

    var sum = 0
    dots.forEach{
        sum += abs(midX - it.x) + abs(midY - it.y)
    }
    bw.write("$sum")

    bw.flush()
    bw.close()
    close()
}
data class Node(
    var x: Int,
    var y: Int
)