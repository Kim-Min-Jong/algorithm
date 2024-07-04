class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        var answer = 0
        
        fun dfs(num: Int, total: Int) {
            if (num == numbers.size) {
                if (target == total) answer++

            } else {
                dfs(num+1, total - numbers[num])
                dfs(num+1, total + numbers[num])
            }        
        }
        dfs(0, 0)
        
        return answer
    }
}