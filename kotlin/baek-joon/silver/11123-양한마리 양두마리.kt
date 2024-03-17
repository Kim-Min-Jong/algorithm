import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var visited: Array<BooleanArray>
lateinit var graph: Array<CharArray>
var cnt = 0
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        cnt = 0
        val (h, w) = readLine().split(" ").map { it.toInt() }
        graph = Array(h) { CharArray(w) }
        visited = Array(h) { BooleanArray(w) { false } }
        for (i in 0 until h) {
            val st = StringTokenizer(readLine())
            st.nextToken().forEachIndexed { j, c ->
                graph[i][j] = c
            }
        }

        for (i in 0 until h) {
            for (j in 0 until w) {
                if (dfs_11123(i, j)) cnt++
            }
        }

        bw.write("$cnt\n")
    }

    bw.flush()
    bw.close()
    close()
}

fun dfs_11123(x: Int, y: Int): Boolean {
    if (x < 0 || y < 0|| x >= graph.size || y >= graph[0].size || visited[x][y]) {
        return false
    }
    if (graph[x][y] == '#') {
        visited[x][y] = true
        dfs_11123(x, y - 1)
        dfs_11123(x, y + 1)
        dfs_11123(x - 1, y)
        dfs_11123(x + 1, y)
        return true
    }
    return false
}