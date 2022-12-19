class Solution {
    fun solution(s: String): IntArray {
        var answer = intArrayOf(0,0)
        var new = s
        while(new != "1"){
            answer[0]++
            answer[1] += new.count{it=='0'}
            new = new.replace("0", "").length.toString(2)
        }
        return answer
    }
}