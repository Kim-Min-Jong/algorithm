import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.abs
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val tc = readLine().toInt()

    repeat(tc) {
        val dots = mutableListOf<Node>()
        repeat(4) {
            val dot = readLine().split(" ").map{ it.toInt() }
            dots.add(Node(dot[0],dot[1]))
        }
        //  좌상, 우상, 좌하, 우하 순으로 정렬
        dots.sortWith(compareBy<Node> { it.x }.thenBy { it.y })
        val square = Square(dots)
        val res = if(square.isSameLength() && square.is90Degree()) 1 else 0
        bw.write("$res\n")
    }

    bw.flush()
    bw.close()
    close()
}
data class Square(
    val dots: MutableList<Node>
) {
    val lb = dots[0]
    val lt = dots[1]
    val rb = dots[2]
    val rt = dots[3]

    fun distance(n1: Node, n2: Node): Int =
        pow(abs(n2.x - n1.x), 2) + pow(abs(n2.y - n1.y), 2)

    fun isSameLength(): Boolean {
        // 윗변
        val topLine = abs(lt.x - rt.x)
        // 아랫변
        val bottomLine = abs(lb.x - rb.x)
        // 왼쪽변
        val leftLine = abs(lt.y - lb.y)
        // 오른쪽변
        val rightLine = abs(rt.y - rb.y)
        if(topLine == bottomLine && topLine == leftLine && topLine == rightLine)
            return true
        return false
    }

    fun is90Degree(): Boolean {
        if(distance(lt, rb) == distance(rt, lb))
            return true
        return false
    }
}
data class Node(
    var x: Int,
    var y: Int
)
fun pow(a: Int, n: Int): Int {
    var ans = 1
    for (i in 0 until n) {
        ans *= a
    }
    return ans
}