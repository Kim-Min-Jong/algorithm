import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var graph: Array<IntArray>
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    for(i in 0 until n) {
        val (x, y, cabbage) = readLine().split(" ").map { it.toInt() }
        var cnt = 0
        graph = Array(x) { IntArray(y) { 0 } }
        for (j in 0 until cabbage) {
            val (a, b) = readLine().split(" ").map { it.toInt() }
            graph[a][b] = 1
        }
        for (a in 0 until x) {
            for (b in 0 until y) {
                if (dfs_1012(a, b)) {
                    cnt++
                }
            }
        }
        bw.write("$cnt\n")
    }

    bw.flush()
    bw.close()
    close()
}
fun dfs_1012(x: Int, y: Int): Boolean {
    if (x < 0 || x >= graph.size || y < 0 || y >= graph[0].size)
        return false
    if (graph[x][y] == 1) {
        graph[x][y] = 0
        dfs_1012(x, y - 1)
        dfs_1012(x, y + 1)
        dfs_1012(x - 1, y)
        dfs_1012(x + 1, y)
        return true
    }
    return false
}