class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n)
        var num:Long = 0
        if(n <= 1000 && n >= 0 && x >= -10000000 && x <= 10000000){
            for(i in 0..n-1){
                num += x.toLong()
                answer[i] = num
            }
        }
        return answer
    }
}