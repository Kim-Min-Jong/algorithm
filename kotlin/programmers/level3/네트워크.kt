class Solution {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        val check = BooleanArray(n){false}
        
        for(i in 0 until n) {
            if(!check[i]) {
                search(computers, i, check)
                answer++
            }
        }
        
        return answer
    }
    fun search(computers:  Array<IntArray>, i: Int, check: BooleanArray) {
        if(check[i])
            return
        else{
            check[i] = true
            for(j in 0 until computers.size) {
                if(computers[i][j] == 1) {
                    search(computers, j ,check)
                }
            }
        }
    }
} // dfs