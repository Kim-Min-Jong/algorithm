class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var tmp = n
        var answer = 0
        while(a <= tmp) {
            val bottles =  b * (tmp / a)
            answer += bottles
            tmp = bottles + (tmp % a)
        }
        return answer
    }
}