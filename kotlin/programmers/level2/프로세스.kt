import java.util.*

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 1
        val pq = PriorityQueue(Comparator.reverseOrder<Int>()) // priorities 값
        for (i in priorities) {
            pq.offer(i)
        }
        while (!pq.isEmpty()) {
            for (i in priorities.indices) {
                if (priorities[i] == pq.peek()) {
                    if (location == i) {
                        return answer
                    }
                    answer++
                    pq.poll()
                }
            }
        }
        return answer
    }
}