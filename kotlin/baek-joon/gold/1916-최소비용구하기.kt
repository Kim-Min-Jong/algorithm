import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
const val INF = Int.MAX_VALUE
lateinit var distance: IntArray

lateinit var resultSet: MutableSet<String>
lateinit var tmp: MutableList<Char>
fun main() = with(System.`in`.bufferedReader()) {
    val v = readLine().toInt()
    val n = readLine().toInt()
    val graph = Array(v) { mutableListOf<VariablePair>() }
    distance = IntArray(v){ INF }
    repeat(n) {
        val (start, end, dist) = readLine().split(" ").map{it.toInt()}
        graph[start-1].add(VariablePair(end-1, dist))
    }
    val (startPoint, endPoint) = readLine().split(" ").map{it.toInt()}

    dijkstra(startPoint-1, graph)
    bw.write("${distance[endPoint-1]}")
    bw.flush()
    bw.close()
    close()
}
data class VariablePair (
    var first: Int,
    var second: Int
)
fun dijkstra(startNum: Int, graph: Array<MutableList<VariablePair>>) {
    // 현재위치, 가중치 가중치가 작은 순서로 정렬
    val queue = PriorityQueue<Pair<Int, Int>> { o1, o2 ->
        when {
            o1.second < o2.second -> -1
            o1.second > o2.second -> 1
            else -> 0
        }
    }
    queue.add(Pair(startNum, 0))
    distance[startNum] = 0
    while(queue.isNotEmpty()) {
        val (now, dist) = queue.poll()
        if(distance[now] < dist)
            continue
        for(next in graph[now]) {
            val tmp = distance[now] + next.second
            if(tmp < distance[next.first]) {
                distance[next.first] = tmp
                queue.add(Pair(next.first, tmp))
            }
        }
    }
}