import java.io.BufferedWriter
import java.io.OutputStreamWriter

val INF = 1_000_000_000
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val m = readLine().toInt()
    val graph = MutableList(n){MutableList<Int>(n){ INF }}

    repeat(m) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        graph[a-1][b-1] = 1
    }

    for(k in 0 until n){
        for(i in 0 until n){
            for(j in 0 until n){
                if(graph[i][j] > graph[i][k] + graph[k][j])
                    graph[i][j] = graph[i][k] + graph[k][j]
            }
        }
    }

    for (i in 0 until n) {
        var cnt = 0
        for (j in 0 until n) {
            if (graph[i][j] == INF && graph[j][i] == INF) cnt++
        }

        bw.write("${cnt - 1}\n")
    }

    bw.flush()
    bw.close()
    close()
}