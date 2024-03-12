import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var visited: BooleanArray

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val m = readLine().toInt()
    val graph = ArrayList<ArrayList<Int>>()

    for (i in 0 .. n) {
        graph.add(ArrayList())
    }

    repeat(m) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }
    visited = BooleanArray(n + 1) { false }
    visited[1] = true

    dfs(1, graph, 0)

    var result = 0
    for (i in 1 until visited.size) {
        if (visited[i]) result++
    }

    // 자기 자신 - 1
    bw.write("${result - 1}")

    bw.flush()
    bw.close()
    close()
}

fun dfs(num: Int, graph: ArrayList<ArrayList<Int>>, depth: Int) {
    if (depth == 2) return
    for (i in 0 until graph[num].size) {
        val tmp = graph[num][i]
        visited[tmp] = true
        dfs(tmp, graph, depth + 1)
    }
}
