import java.util.*
class Solution {
    fun solution(n: Int, costs: Array<IntArray>): Int {
        var answer = 0
        val graph = Array(n) { mutableListOf<Edge>() }
        costs.forEach { cost ->
            graph[cost[0]].add(Edge(cost[1], cost[2]))
            graph[cost[1]].add(Edge(cost[0],cost[2]))
            
        }
        answer = prim(0, n, graph)
        return answer
    }
    fun prim(startNum: Int, n:Int, graph: Array<MutableList<Edge>>):Int {
        var res = 0
        val visited = BooleanArray(n) {false}
        val queue = PriorityQueue<Edge> { o1, o2 ->
            when {
                o1.cost < o2.cost -> -1
                o1.cost > o2.cost-> 1
                else -> 0
            }
        }
        queue.add(Edge(startNum, 0))
        
        while(queue.isNotEmpty()) {
            val (now, cost) = queue.poll()
            
            if(visited[now]) continue
            
            visited[now] = true
            res += cost
            
            for(tmp in graph[now]) {
                if(!visited[tmp.node]) {
                    queue.add(tmp)
                }
            }
        }
        return res
    }
}
data class Edge(
    var node: Int,
    var cost: Int
)