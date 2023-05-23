class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf(0,0)
        val area = brown + yellow
        for(i in 3..area){
            if(area % i == 0){
                val num = area / i
                if((i-2) *(num-2) == yellow){
                    answer[0] = num
                    answer[1] = i
                    break
                }
            }
        }

        return answer
    }
}