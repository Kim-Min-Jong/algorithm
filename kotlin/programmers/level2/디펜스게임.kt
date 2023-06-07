import java.util.*
class Solution {
    fun solution(n: Int, k: Int, enemy: IntArray): Int {
        var answer: Int = 0
        var tmp = n
        val pq = PriorityQueue<Int>()
        for(i in enemy.indices){
            pq.add(enemy[i])
            if(pq.size > k) {
                tmp -= pq.poll()
            }
            if(tmp < 0) return i
        }
        return enemy.size
    }
}