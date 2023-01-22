class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        val len = p.length
        for(i in 0 until t.length - len +1) {
            if(t.substring(i until i+len).toLong() <= p.toLong())
                answer++
        }
        return answer
    }
}