import java.util.*
class Solution {
    lateinit var distance: IntArray
    val INF = Int.MAX_VALUE
    fun solution(n: Int, roads: Array<IntArray>, sources: IntArray, destination: Int): IntArray {
        var answer: IntArray = IntArray(sources.size){0}
        val graph = Array(n) { mutableListOf<Int>() }
        roads.forEach { edge ->
            graph[edge[0]-1].add(edge[1]-1)
            graph[edge[1]-1].add(edge[0]-1)
            
        }

        distance = IntArray(n){ INF }
        dijkstra(destination-1 ,graph)
        repeat(sources.size) {
            answer[it] = if(distance[sources[it]-1] == INF) -1 else distance[sources[it]-1]
        }
        return answer
    }
    fun dijkstra(startNum: Int, graph: Array<MutableList<Int>>) {
            val queue:Queue<Int> = LinkedList<Int>()
            queue.add(startNum)
            distance[startNum] = 0
            while(queue.isNotEmpty()) {
                val now = queue.poll()
                for(next in graph[now]) {
                    if(distance[next] > distance[now] + 1) {
                        distance[next] = distance[now] + 1
                        queue.add(next)
                    }
                }
            }
        }
}
