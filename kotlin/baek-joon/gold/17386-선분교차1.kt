import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (x1, y1, x2, y2) = readLine().split(" ").map{it.toLong()}
    val (x3, y3, x4, y4) = readLine().split(" ").map{it.toLong()}
    val dot1 = Node(x1, y1)
    val dot2 = Node(x2, y2)
    val dot3 = Node(x3, y3)
    val dot4 = Node(x4, y4)

    val cross1 = ccw(dot1, dot2, dot3) * ccw(dot1, dot2, dot4)
    val cross2 = ccw(dot3, dot4, dot1) * ccw(dot3, dot4, dot2)
    if(cross1 == -1 && cross2 == -1)
        bw.write("1")
    else bw.write("0")

    bw.flush()
    bw.close()
    close()
}
fun ccw(p1: Node, p2: Node, p3: Node): Int {
    return when((p1.x * p2.y + p2.x * p3.y + p3.x * p1.y) - (p2.x * p1.y + p3.x * p2.y + p1.x * p3.y)) {
        in Long.MIN_VALUE until 0L -> -1 // 시계방향
        in 1L until Long.MAX_VALUE -> 1 // 반시계방향
        else -> 0
    }
}
data class Node(
    var x: Long,
    var y: Long
)
