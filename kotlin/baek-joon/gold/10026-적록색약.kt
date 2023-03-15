import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var graph_10026: Array<CharArray>
val dx = intArrayOf(1, -1, 0, 0)
val dy = intArrayOf(0, 0, -1, 1)

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var normalCnt = 0
    var blindCnt = 0
    graph_10026 = Array(n) { CharArray(n) {'0'} }
    for(i in 0 until n) {
        val list = readLine().toCharArray()
        for(j in 0 until n) {
            graph_10026[i][j] = list[j]
        }
    }
   val copied = graph_10026.map{ it.clone() }.toTypedArray()

   for(i in 0 until n) {
        for(j in 0 until n) {
            if(graph_10026[i][j] != 'X') {
                dfs_10026(i, j, graph_10026[i][j])
                normalCnt++
            }
        }
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (copied[i][j] == 'G') {
                copied[i][j] = 'R'
            }
        }
    }

    val visited = Array(n) { BooleanArray(n) }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (!visited[i][j]) {
                dfs_10026(i, j, copied[i][j], visited, copied)
                blindCnt++
            }
        }
    }
    bw.write("$normalCnt $blindCnt")

    bw.flush()
    bw.close()
    close()
}
fun dfs_10026(x: Int, y: Int, color: Char) {
    graph_10026[x][y] = 'X'

    for (i in 0 until 4) {
        val nx = x + dx[i]
        val ny = y + dy[i]
        if (nx in graph_10026.indices && ny in graph_10026.indices && graph_10026[nx][ny] == color) {
            dfs_10026(nx, ny, color)
        }
    }
}
fun dfs_10026(x: Int, y: Int, color: Char, visited: Array<BooleanArray>, graph: Array<CharArray>) {
    visited[x][y] = true

    for (i in 0 until 4) {
        val nx = x + dx[i]
        val ny = y + dy[i]
        if (nx in graph.indices && ny in graph.indices && !visited[nx][ny] && graph[nx][ny] == color) {
            dfs_10026(nx, ny, color, visited, graph) 
        }
    }
}