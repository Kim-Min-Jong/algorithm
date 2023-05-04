import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var graph: Array<IntArray>
const val INF = 10000000
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    graph = Array(n){ IntArray(n){INF} }

    while(true) {
        val (x, y) = readLine().split(" ").map{it.toInt()}
        if(x == -1 && y == -1) break
        graph[x-1][y-1] = 1
        graph[y-1][x-1] = 1
    }
    for(i in graph.indices){
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
    for(i in graph) {
        list.add(i.maxOf { it })
    }
    val min = list.minOrNull()
    bw.write("$min ${list.count { it == min }}\n")
    val sb = StringBuilder()
    for(i in list.indices) {
        if(list[i] == min) {
            sb.append("${i+1} ")
        }
    }
    bw.write(sb.toString())

    bw.flush()
    bw.close()
    close()
}