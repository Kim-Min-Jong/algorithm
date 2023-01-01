import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.min

val bw = BufferedWriter(OutputStreamWriter(System.out))
const val INF = 10000000
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n) { IntArray(n) { INF } }
    var cnt = INF
    repeat(m) {
        val (a, b, c) = readLine().split(" ").map { it.toInt() }
        if (graph[a - 1][b - 1] > c)
            graph[a - 1][b - 1] = c
    }
    for (i in 0 until graph.size) {
        for (j in 0 until graph[i].size) {
            if (i == j)
                graph[i][j] = 0
        }
    }

    for (k in 0 until n) {
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (graph[i][j] > graph[i][k] + graph[k][j])
                    graph[i][j] = graph[i][k] + graph[k][j]
            }
        }
    }
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if(graph[i][j]!=INF && graph[j][i]!=INF)
                cnt = min(cnt, graph[i][j] + graph[j][i])
        }
    }
    when(cnt) {
        INF -> bw.write("-1")
        else -> bw.write("$cnt")
    }

    bw.flush()
    bw.close()
    close()
}
