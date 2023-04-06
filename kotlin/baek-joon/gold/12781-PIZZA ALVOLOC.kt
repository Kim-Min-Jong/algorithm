import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val dotList = readLine().split(" ").map{it.toLong()}
    val dot1 = Node(dotList[0], dotList[1])
    val dot2 = Node(dotList[2], dotList[3])
    val dot3 = Node(dotList[4], dotList[5])
    val dot4 = Node(dotList[6], dotList[7])

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
// 선분교차1과 같은문제