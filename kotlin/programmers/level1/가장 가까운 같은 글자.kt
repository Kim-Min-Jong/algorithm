class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = IntArray(s.length){ 0 }
        var cnt = 0
        for(i in 0 until s.length) {
            cnt = -1
            for(j in i-1 downTo 0) {
                if(s[i] == s[j]) {
                    cnt = i - j
                    break
                }
            }
            answer[i] = cnt
        }
        return answer
    }
}