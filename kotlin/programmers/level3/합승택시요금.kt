class Solution {
    val INF = 10000000
    fun solution(n: Int, s: Int, a: Int, b: Int, fares: Array<IntArray>): Int {
        var answer: Int = INF
        val graph = MutableList(n){MutableList<Int>(n){INF}}
        fares.forEach { fare ->
            graph[fare[0]-1][fare[1]-1] = fare[2]
            graph[fare[1]-1][fare[0]-1] = fare[2]
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
            answer = Math.min(answer, graph[s-1][i] + graph[i][a-1] + graph[i][b-1])
        }
        
        return answer
    }
}