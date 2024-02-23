import kotlin.math.pow
import kotlin.math.sqrt
class Solution {
    fun solution(k: Int, d: Int): Long {
        var answer: Long = 0
        for (i in 0..(d/k)) {
            val longX = i*k
            val longY = (sqrt(d.toDouble().pow(2.0) - longX.toDouble().pow(2.0)) / k).toLong()

        answer += longY + 1L
    }
        return answer
    }
}