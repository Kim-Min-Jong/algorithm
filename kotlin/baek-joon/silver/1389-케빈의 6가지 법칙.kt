import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
const val INF = 10000000
fun main() = with(System.`in`.bufferedReader()){
    val(n , m) = readLine().split(" ").map { it.toInt() }
    val graph = MutableList(n){MutableList(n){INF}}
    repeat(m){
        val (a, b) = readLine().split(" ").map{it.toInt()}
        graph[a-1][b-1] = 1
        graph[b-1][a-1] = 1
    }
    for(i in 0 until graph.size){
        for(j in 0 until graph[i].size){
            if(i == j)
                graph[i][j] = 0
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

    val list = mutableListOf<Int>()
    for (i in 0 until graph.size) {
        list.add(graph[i].sum())
    }
    bw.write("${list.indexOf(list.min()) + 1}")

    bw.flush()
    bw.close()
    close()
}