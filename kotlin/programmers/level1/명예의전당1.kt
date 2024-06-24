import java.util.PriorityQueue
class Solution {
    fun solution(k: Int, scores: IntArray): IntArray {
        var answer= mutableListOf<Int>()
        val pq = PriorityQueue<Int>()
        for (score in scores) {
            pq.add(score)
            if (pq.size > k) {
                pq.poll() 
            } 
           answer.add(pq.first())
        }
        
        return answer.toIntArray()
    }
}