import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
var cnt = 0
lateinit var graph: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().split(" ").map{ it.toInt() }
    val cntList = mutableListOf<Int>()
    graph = Array(n){IntArray(m){0} }
    for(i in 0 until k) {
        val (x, y) = readLine().split(" ").map{it.toInt()}
        graph[x-1][y-1] = 1
    }

    for ( i in 0 until n ) {
        for ( j in 0 until m ) {
            if (dfs_1743(i, j)) {
                cntList.add(cnt)
                cnt = 0
            }
        }
    }
    bw.write("${cntList.maxOrNull()}")

    bw.flush()
    bw.close()
    close()
}
fun dfs_1743(x: Int, y: Int): Boolean {
    if (x < 0 || x >= graph.size || y < 0 || y >= graph[0].size)
        return false
    if (graph[x][y] == 1) {
        // 사방탐색
        graph[x][y] = 0
        cnt++
        dfs_1743(x, y - 1)
        dfs_1743(x, y + 1)
        dfs_1743(x - 1, y)
        dfs_1743(x + 1, y)

        return true
    }
    return false
}