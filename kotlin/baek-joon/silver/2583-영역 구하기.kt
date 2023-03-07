import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
var cnt = 0
lateinit var graph: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()) {
    val (m, n, tc) = readLine().split(" ").map{it.toInt()}
    graph = Array(m) { IntArray(n){0} }
    val cntList = mutableListOf<Int>()
    var res = 0
    for(i in 0 until tc) {
        val (x1, y1, x2, y2) = readLine().split(" ").map{it.toInt()}
        (y1 until y2).forEach { y ->
            (x1 until x2).forEach { x ->
                graph[y][x] = 1
            }
        }
    }
    for ( i in 0 until n ) {
        for ( j in 0 until m ) {
            if (dfs_2583(i, j)) {
                cntList.add(cnt)
                res++
                cnt = 0
            }
        }
    }
    bw.write("$res\n")
    cntList.sorted().forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
    close()
}
fun dfs_2583(x: Int, y: Int): Boolean {
    if (x < 0 || x >= graph.size || y < 0 || y >= graph[0].size)
        return false
    if (graph[x][y] == 0) {
        // 사방탐색
        graph[x][y] = 1
        cnt++
        dfs_2583(x, y - 1)
        dfs_2583(x, y + 1)
        dfs_2583(x - 1, y)
        dfs_2583(x + 1, y)

        return true
    }
    return false
}