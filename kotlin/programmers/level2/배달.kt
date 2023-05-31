import java.util.*
class Solution {
    lateinit var distance: IntArray
    val INF = Int.MAX_VALUE
    fun solution(N: Int, road: Array<IntArray>, k: Int): Int {
        val graph = Array(N) { mutableListOf<Pair<Int, Int>>() }
        distance = IntArray(N){ INF }
        road.forEach { edge ->
            graph[edge[0]-1].add(Pair(edge[1]-1, edge[2]))
            graph[edge[1]-1].add(Pair(edge[0]-1, edge[2]))
            
        }
        dijkstra(0, graph)
        return distance.count{it <= k}
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
}