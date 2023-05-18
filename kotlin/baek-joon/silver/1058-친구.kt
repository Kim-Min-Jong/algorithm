import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

const val INF = 10000000
lateinit var graph: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    graph = Array(n) { IntArray(n){INF} }
    for(i in 0 until n) {
        val st = readLine().chunked(1).map{ if(it == "N") INF else 1}
        for(j in 0 until n) {
            graph[i][j] = st[j]
        }
    }
    for(i in 0 until n) {
        for(j in 0 until n) {
            if(i == j) graph[i][j] = 0
        }
    }
    for(k in 0 until n) {
        for(i in 0 until n) {
            for(j in 0 until n) {
                if(graph[i][j] > graph[i][k] + graph[k][j])
                    graph[i][j] = graph[i][k] + graph[k][j]
            }
        }
    }
    var res = 0
    for(i in 0 until n) {
        var cnt = 0
        for(j in 0 until n) {
            if(i != j && graph[i][j] <= 2) cnt++
        }
        res = max(cnt, res)
    }

    bw.write("$res")

    bw.flush()
    bw.close()
    close()
}