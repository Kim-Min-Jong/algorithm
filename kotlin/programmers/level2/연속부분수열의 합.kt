import java.util.*
class Solution {
    fun solution(elements: IntArray): Int {
        var answer: Int = 0
        var list = elements + elements
        val s = mutableSetOf<Int>()

        for(i in 1..elements.size) {
            for(j in 0 until elements.size) {
                var sum = 0
                for(k in j until i + j) {
                    sum += elements[k % elements.size]
                }
                s.add(sum)
            }
        }
        answer = s.size
        return answer
    }
}