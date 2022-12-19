class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        var sum:Long = 0
        for(i in 0..count){
            sum += price * i
        }
        answer = sum - money.toLong()
        if(answer < 0)
            return 0
        return answer
    }
}