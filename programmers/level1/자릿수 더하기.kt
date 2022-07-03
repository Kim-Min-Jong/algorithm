class Solution {
    fun solution(n: Int): Int {
        var answer:Int = 0
        val str = n.toString()
        for (i in 0..str.length-1){
            answer += str[i].toString().toInt()
        }

        return answer
    }
}