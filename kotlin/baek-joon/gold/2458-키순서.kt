import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var graph: Array<IntArray>
const val INF = 10000000
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{ it.toInt() }

    graph = Array(n){IntArray(n){0} }
    for(i in 0 until m) {
        val (x, y)= readLine().split(" ").map{it.toInt()}
            graph[x-1][y-1] = 1
    }
    for(i in 0 until n) {
        for(j in 0 until n) {
            if(i != j && graph[i][j] == 0)
                graph[i][j] = INF
        }
    }

    for(k in 0 until n) {
        for(i in 0 until n) {
            for(j in 0 until n) {
                if (graph[i][j] > graph[i][k] + graph[k][j])
                    graph[i][j] = graph[i][k] + graph[k][j]
            }
        }
    }

    var cnt = 0
    // 완전탐색하면서 i->j j->i 서로 못가면 비교불가
    for(i in 0 until n) {
        var flag = false
        for(j in 0 until n) {
            if(graph[i][j] == INF && graph[j][i] == INF ){
                flag = true
                break
            }
        }
        if(!flag) cnt++
    }
    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}