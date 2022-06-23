class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        var sortedArr = citations.sortedByDescending{it}
        for(i in sortedArr.indices){
            if(sortedArr[i] < i+1)
                break
            else
                answer = i+1
        }
        return answer
    }
}