import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var visited2: Array<Boolean>
lateinit var graph: Array<IntArray>
var answer = -1

fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val (start, end) = readLine().split(" ").map { it.toInt() }

    graph = Array<IntArray>(n + 1) { IntArray(n + 1) { 0 } }
    visited2 = Array(n + 1) { false }
    repeat(readLine().toInt()) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        graph[x][y] = 1
        graph[y][x] = 1
    }

    dfs_2644(start, end, 0)

    bw.write("$answer")

    closeBW()
    close()
}

fun dfs_2644(start: Int, end: Int, num: Int){
    visited2[start] = true
    if (start == end) {
        answer = num
        return
    }

    for (i in 1 until graph.size) {
        if (!visited2[i] && graph[start][i] == 1) {
            dfs_2644(i, end, num + 1)
        }
    }
}