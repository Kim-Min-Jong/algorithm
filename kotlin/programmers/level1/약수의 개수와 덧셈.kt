class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        var cnt = 0
        for(i in left until right+1){
            for(j in 1..i){
                if(i % j == 0) cnt++ 
            }
            if(cnt % 2 == 0) answer += i else answer -= i
            cnt = 0
        }
        return answer
    }
}