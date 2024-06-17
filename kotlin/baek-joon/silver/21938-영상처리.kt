import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

lateinit var visited: Array<BooleanArray>
lateinit var graph: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }

    graph = Array(n) { IntArray(m) }
    visited = Array(n) { BooleanArray(m) }
    var res = 0

    for (i in 0 until n) {
        val st = StringTokenizer(readLine())
        for (j in 0 until m) {
            var sum = 0
            for (k in 0 until 3) {
                sum += st.nextToken().toInt()
            }
            graph[i][j] = floor(sum / 3.0).toInt()
        }
    }

    val threshHold = readLine().toInt()

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (dfs_21938(i, j, threshHold))
                res++
        }
    }

    bw.write("$res")

    bw.flush()
    bw.close()
    close()
}

fun dfs_21938(x: Int, y: Int, threshHold: Int): Boolean {
    if (x < 0 || y < 0 || x >= graph.size || y >= graph[0].size || visited[x][y]) {
        return false
    }
    if (graph[x][y] >= threshHold) {
        visited[x][y] = true
        dfs_21938(x, y - 1, threshHold)
        dfs_21938(x, y + 1, threshHold)
        dfs_21938(x - 1, y, threshHold)
        dfs_21938(x + 1, y, threshHold)
        return true
    }
    return false
}