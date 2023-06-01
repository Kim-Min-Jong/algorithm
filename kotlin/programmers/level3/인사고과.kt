class Solution {
    fun solution(scores: Array<IntArray>): Int {
        var answer: Int = 1
        val wanho = scores[0]
        var tmp_peer = 0
        val list = scores.slice(1 until scores.size).sortedWith(compareByDescending<IntArray>{it[0]}.thenBy{it[1]}).map{
            it.toList()
        }
        for(task in list) {
            if(wanho[0] < task[0] && wanho[1] < task[1]) return -1
            if(tmp_peer <= task[1]) {
                tmp_peer = task[1]
                if(wanho[0] + wanho[1] < task[0] + task[1])
                    answer++
            }
        }
        return answer
    }
}