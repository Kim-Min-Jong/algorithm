class Solution {
    var sum = 0
    val list = mutableListOf<Int>()
    fun solution(maps: Array<String>): IntArray {
        val graph = maps.map{it.chunked(1).toMutableList()}.toMutableList()
        for ( i in 0 until graph.size ) {
            for ( j in 0 until graph[0].size ) {
                if (dfs(i, j, graph)) {
                    list.add(sum)
                    sum = 0
                }
            }
        }

        return if(list.isNotEmpty()) list.sorted().toIntArray() else intArrayOf(-1)
    }
    fun dfs(x: Int, y: Int, maps:MutableList<MutableList<String>>):Boolean {
        if(x < 0 || x >= maps.size || y < 0 || y >= maps[0].size)
            return false
        if(maps[x][y] != "X"){
            sum += maps[x][y].toInt()
            maps[x][y] = "X"
            dfs(x,y-1, maps)
            dfs(x,y+1, maps)
            dfs(x-1,y, maps)
            dfs(x+1,y, maps)
            return true
        }
        return false
    }
}