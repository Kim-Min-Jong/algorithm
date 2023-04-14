import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
var cnt = 2
lateinit var graph: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()) {
    val (m, n) = readLine().split(" ").map{it.toInt()}
    graph = Array(m){IntArray(n){0} }
    for(i in 0 until m) {
        val st = readLine().chunked(1).map{it.toInt()}
        for(j in 0 until n) {
            graph[i][j] = st[j]
        }
    }
    for ( i in 0 until n ) {
        for ( j in 0 until n ) {
            if (dfs_13565(i, j)) {
                cnt++
            }
        }
    }

    val outerSideGraph = graph[0].filter{ it != 1 }
    val innerSideGraph = graph[m-1].filter{ it != 1 }
    var flag = false
    loop@for(i in outerSideGraph) {
        for(j in innerSideGraph) {
            if(i == j) {
                flag = true
                break@loop
            }
        }
    }
    val res = if(flag) "YES" else "NO"
    bw.write(res)

    bw.flush()
    bw.close()
    close()
}
fun dfs_13565(x: Int, y: Int): Boolean {
    if (x < 0 || x >= graph.size || y < 0 || y >= graph[0].size)
        return false
    if (graph[x][y] == 0) {
        // 사방탐색
        graph[x][y] = cnt
        dfs_13565(x, y - 1)
        dfs_13565(x, y + 1)
        dfs_13565(x - 1, y)
        dfs_13565(x + 1, y)

        return true
    }
    return false
}