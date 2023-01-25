class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        var answer = mutableListOf<Int>()
        var a = left
        while (a <= right) {
            answer.add(Math.max(a / n.toLong(), a % n.toLong()).toInt() + 1 )
            a++
        }
        return answer.toIntArray()
    }
}