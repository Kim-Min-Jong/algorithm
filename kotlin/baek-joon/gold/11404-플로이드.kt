import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
const val INF = 10000000
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val cnt = readLine().toInt()
    val graph = MutableList(n){MutableList<Int>(n){INF}}
    repeat(cnt){
        val (a,b,c) = readLine().split(" ").map{it.toInt()}
        if(graph[a-1][b-1] > c)
            graph[a-1][b-1] = c
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

    for(i in 0 until n){
        for(j in 0 until n){
            if(graph[i][j] == INF) bw.write("0 ")
            else bw.write("${graph[i][j]} ")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
    close()
}