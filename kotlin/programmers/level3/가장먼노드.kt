import java.util.*
class Solution {
    lateinit var distance: IntArray
    val INF = Int.MAX_VALUE
    fun solution(n: Int, edges: Array<IntArray>): Int {
        var answer = 0
        val graph = Array(n) { mutableListOf<Pair<Int, Int>>() }
        distance = IntArray(n){ INF }
        edges.forEach { edge ->
            graph[edge[0]-1].add(Pair(edge[1]-1, 1))
            graph[edge[1]-1].add(Pair(edge[0]-1, 1))
            
        }
        dijkstra(0, graph)
        val res = distance.filter{it != INF}.maxOrNull()
        answer = distance.count{ it == res}
        return answer
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