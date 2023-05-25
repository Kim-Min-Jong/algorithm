class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        var tmp = k
        val group = tangerine.groupBy{ it }.map{it.key to it.value.size}.sortedByDescending{it.second}
        for(i in group) {
            if(tmp <= 0) break
            tmp -= i.second
            answer++
        }

        return answer
    }
}