import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
const val INF = 10000000
lateinit var distance: IntArray
fun main() = with(System.`in`.bufferedReader()) {
    val (N, M, K, X) = readLine().split(" ").map{it.toInt()}
    val graph = Array(N) { mutableListOf<Pair<Int, Int>>() }
    distance = IntArray(N){ INF }
    repeat(M) {
        val (start, end) = readLine().split(" ").map{it.toInt()}
        graph[start-1].add(Pair(end-1, 1))
    }

    dijkstra(X-1, graph)
    if(!distance.contains(K)) {
        bw.write("-1")
    } else {
        distance.forEachIndexed { index, i ->
            if(i == K) bw.write("${index+1}\n")
        }
    }
    bw.flush()
    bw.close()
    close()
}
fun dijkstra(startNum: Int, graph: Array<MutableList<Pair<Int,Int>>>) {
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