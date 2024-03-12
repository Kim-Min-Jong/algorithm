import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var visited: Array<BooleanArray>
lateinit var graph: Array<CharArray>
var cnt = 0
                        
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    graph = Array(n) { CharArray(m) }
    visited = Array(n) { BooleanArray(m) { false } }
    val point = mutableListOf<Int>()
    for (i in 0 until n) {
        val st = StringTokenizer(readLine())
        st.nextToken().forEachIndexed { j, c ->
            graph[i][j] = c
            if (c == 'I') {
                point.add(i)
                point.add(j)
            }
        }
    }

    dfs_21736(point[0], point[1])

    bw.write("${if (cnt == 0) "TT" else cnt }")

    bw.flush()
    bw.close()
    close()
}

fun dfs_21736(x: Int, y: Int) {
    if (x < 0 || y < 0|| x >= graph.size || y >= graph[0].size || visited[x][y]) {
        return
    }
    visited[x][y] = true
    
    if (graph[x][y] == 'P') {
        cnt++
    }
    if (graph[x][y] != 'X') {
        dfs_21736(x, y - 1)
        dfs_21736(x, y + 1)
        dfs_21736(x - 1, y)
        dfs_21736(x + 1, y)
    }
}