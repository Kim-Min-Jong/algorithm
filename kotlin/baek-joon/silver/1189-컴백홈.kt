import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var visited: Array<BooleanArray>
lateinit var graph: Array<CharArray>
var cnt = 0

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().split(" ").map { it.toInt() }
    graph = Array(n) { CharArray(m) }
    visited = Array(n) { BooleanArray(m) { false } }
    for (i in 0 until n) {
        val st = StringTokenizer(readLine())
        st.nextToken().forEachIndexed { j, c ->
            graph[i][j] = c
        }
    }

    dfs_1189(n - 1, 0, m, k, 1)

    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}

fun dfs_1189(x: Int, y: Int, m: Int, k: Int, step: Int) {
    if (x == 0 && y == m - 1) {
        if (step == k)
            cnt++
        return
    }
    if (x < 0 || y < 0|| x >= graph.size || y >= graph[0].size || visited[x][y] || graph[x][y] == 'T') {
        return
    }
    visited[x][y] = true
    dfs_1189(x, y - 1, m, k, step + 1)
    dfs_1189(x, y + 1, m, k, step + 1)
    dfs_1189(x - 1, y, m, k, step + 1)
    dfs_1189(x + 1, y, m, k, step + 1)
    visited[x][y] = false
}