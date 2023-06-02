import kotlin.math.*
class Solution {
    fun solution(sequence: IntArray): Long {
        val pulse1 = sequence.mapIndexed{ idx, n -> if(idx % 2 == 0) n*1 else n*-1 }
        val pulse2 = sequence.mapIndexed{ idx, n -> if(idx % 2 == 0) n*-1 else n*1 }
        return max(findPulseArraySum(pulse1), findPulseArraySum(pulse2))
    }
    fun findPulseArraySum(arr: List<Int>): Long {
        val dp = LongArray(arr.size){0L}
        dp[0] = arr[0].toLong()
        for(i in 1 until arr.size) {
            dp[i] = max(0, dp[i-1]) + arr[i]
        }
        return dp.maxOrNull()!!
    }
}