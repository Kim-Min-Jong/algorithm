class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        val list = mutableListOf<Int>()
        var cnt: Int = 0
        (1..number).forEach {
            cnt = 0
            var i = 1
            while(i * i <= it) {
                if(i * i == it) cnt++
                else if(it % i == 0) cnt += 2
                i++
            }
            list.add(cnt)
        }
        for(i in list.indices) {
            if(list[i] > limit) list[i] = power
        }
        answer = list.sum()
        return answer
    }
}