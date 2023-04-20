import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var graph: Array<IntArray>
const val INF = 10000000
fun main() = with(System.`in`.bufferedReader()) {
    val (n, tc) = readLine().split(" ").map{it.toInt()}
    graph = Array(n){IntArray(n){INF}}

    for(i in 0 until n) {
        val list = readLine().split(" ").map{it.toInt()}
        for(j in 0 until n) {
            graph[i][j] = list[j]
        }
    }
    for(k in 0 until n){
        for(i in 0 until n){
            for(j in 0 until n){
                if(graph[i][j] > graph[i][k] + graph[k][j])
                    graph[i][j] = graph[i][k] + graph[k][j]
            }
        }
    }

    repeat(tc) {
        val (start, end, dist) = readLine().split(" ").map{it.toInt() - 1}
        if(graph[start][end] > dist+1)
            bw.write("Stay here\n")
        else bw.write("Enjoy other party\n")
    }

    bw.flush()
    bw.close()
    close()
}