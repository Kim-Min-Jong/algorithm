class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray) = intArrayOf(
            6 - lottos.filter{ win_nums.contains(it) || it == 0 }.size,
            6 - lottos.filter{ win_nums.contains(it) }.size
        ).map{ if(it > 6) 6 else it }
    
}