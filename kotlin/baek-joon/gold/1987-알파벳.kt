import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.*


val bw = BufferedWriter(OutputStreamWriter(System.out))
var cnt = 0
val dx = intArrayOf(1, -1, 0, 0)
val dy = intArrayOf(0, 0, -1, 1)
lateinit var graph: Array<IntArray>
lateinit var visited: BooleanArray
fun main() = with(System.`in`.bufferedReader()) {
    val (r, c) = readLine().split(" ").map{it.toInt()}
    graph = Array(r){IntArray(c){0} }
    visited = BooleanArray(26){false}
    for(i in 0 until r) {
        val input = readLine()
        for(j in 0 until c) {
            graph[i][j] = input[j] - 'A'
        }
    }
    dfs_1987(0, 0, r, c, 0)
    bw.write("$cnt")
    bw.flush()
    bw.close()
    close()
}
fun dfs_1987(x: Int, y: Int, r: Int, c: Int, tmp: Int) {
    if (visited[graph[x][y]]) {
        cnt = max(cnt, tmp)
        return
    } else {
        visited[graph[x][y]] = true
        for (i in 0..3) {
            val cx = x + dx[i]
            val cy = y + dy[i]
            if (cx >= 0 && cy >= 0 && cx < r && cy < c) {
                dfs_1987(cx, cy, r, c, tmp + 1)
            }
        }
        visited[graph[x][y]] = false
    }
}