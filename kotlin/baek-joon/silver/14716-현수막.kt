import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
var cnt = 0
lateinit var graph: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{ it.toInt() }
    val cntList = mutableListOf<Int>()
    graph = Array(n){IntArray(m){0} }
    for(i in 0 until n) {
        val list = readLine().split(" ").map{it.toInt()}
        for(j in 0 until m) {
            graph[i][j] = list[j]
        }
    }

    for ( i in 0 until n ) {
        for ( j in 0 until m ) {
            if (dfs_14716(i, j)) {
                cnt++
            }
        }
    }
    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}
fun dfs_14716(x: Int, y: Int): Boolean {
    if (x < 0 || x >= graph.size || y < 0 || y >= graph[0].size)
        return false
    if (graph[x][y] == 1) {
        // 팔방탐색
        graph[x][y] = 0
        dfs_14716(x, y - 1)
        dfs_14716(x, y + 1)
        dfs_14716(x - 1, y)
        dfs_14716(x + 1, y)
        dfs_14716(x - 1, y - 1)
        dfs_14716(x - 1, y + 1)
        dfs_14716(x + 1, y - 1)
        dfs_14716(x + 1, y + 1)

        return true
    }
    return false
}