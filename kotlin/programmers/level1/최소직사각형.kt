class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        var maxWidth:Int = 0
        var maxHeight:Int = 0
        for (s in sizes) {
            maxWidth = maxOf(maxWidth, s[0], s[1])  
            maxHeight = maxOf(maxHeight, minOf(s[0], s[1]))  
        }
        answer = maxHeight * maxWidth
        return answer
    }
}