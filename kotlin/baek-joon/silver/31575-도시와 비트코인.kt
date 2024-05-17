import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

lateinit var visited: Array<BooleanArray>
lateinit var graph: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m)= readLine().split(" ").map { it.toInt() }
    graph = Array(m) { IntArray(n) {0} }
    visited = Array(m) { BooleanArray(n) {false} }
    for (i in 0 until m) {
        val arr = readLine().split(" ").map { it.toInt() }
        for (j in arr.indices) {
            graph[i][j] = arr[j]
        }
    }

    dfs_31575(0, 0)

    bw.write(if (visited[m-1][n-1]) "Yes" else "No")

    bw.flush()
    bw.close()
    close()
}

fun dfs_31575(x: Int, y: Int): Boolean {
    if (x < 0 || y < 0 || x >= graph.size || y >= graph[0].size || visited[x][y]) {
        return false
    }
    if (graph[x][y] == 1) {
        visited[x][y] = true
        dfs_31575(x, y + 1)
        dfs_31575(x + 1, y)
        return true
    }
    return false
}