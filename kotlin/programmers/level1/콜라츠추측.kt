class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var n:Long = num.toLong()
        if(num == 1) return 0
        else{
            while(n != 1.toLong()){
                if(n % 2 == 0.toLong()){
                    n = n / 2
                    answer++
                }else{
                    n = n * 3 + 1
                    answer++
                }
            }
            if(answer >= 500) return -1
        }
        return answer
    }
}