import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*


val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val list = mutableListOf<Node>()
   repeat(3) {
       val (x, y) = readLine().split(" ").map{it.toInt()}
        list.add(Node(x,y))
   }
    val res = ccw(list[0], list[1], list[2])
    when{
        res > 0 -> bw.write("1")
        res < 0 -> bw.write("-1")
        else -> bw.write("0")
    }

    bw.flush()
    bw.close()
    close()
}

data class Node(
    var x: Int,
    var y: Int
)

fun ccw(p1: Node, p2: Node, p3: Node): Int =
    (p1.x * p2.y + p2.x * p3.y + p3.x * p1.y) - (p2.x * p1.y + p3.x * p2.y + p1.x * p3.y)
