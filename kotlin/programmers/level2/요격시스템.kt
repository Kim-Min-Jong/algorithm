class Solution {
    fun solution(targets: Array<IntArray>): Int {
        var answer: Int = 0
        targets.sortWith(compareBy<IntArray>{it[1]}.thenBy{it[0]})
        var s = 0
        var e = 0
        for(target in targets) {
            if(target[0] >= e) {
                answer++
                e = target[1]
            }
        }
        return answer
    }
}