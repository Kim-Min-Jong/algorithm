import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.sqrt
import kotlin.system.exitProcess

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var graph: Array<IntArray>
val dx = intArrayOf(1, -1, 0, 0)
val dy = intArrayOf(0, 0, -1, 1)
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{it.toInt()}
    val graph = mutableListOf<MutableList<Int>>()
    repeat(n) {
        val list = readLine().chunked(1).map{it.toInt()}.toMutableList()
        graph.add(list)
    }
    bw.write("${bfs_2178(0, 0, n, m, graph)}")

    bw.flush()
    bw.close()
    close()
}
data class Node(
    var x: Int,
    var y: Int
)
fun bfs_2178(x:Int, y:Int, n:Int, m:Int, graph: MutableList<MutableList<Int>>): Int {
    val queue: Queue<Node> = LinkedList<Node>()
    val visited = Array(n){BooleanArray(m) {false} }
    visited[0][0] = true
    queue.add(Node(x,y))
    while(queue.isNotEmpty()) {
        val tmp = queue.poll()
        for(i in 0..3) {
            val nx = tmp.x + dx[i]
            val ny = tmp.y + dy[i]
            if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue
            if(visited[nx][ny] || graph[nx][ny] == 0) continue

            queue.add(Node(nx, ny))
            graph[nx][ny] =  graph[tmp.x][tmp.y] + 1
            visited[nx][ny] = true
        }
    }
    return graph[n-1][m-1]
}