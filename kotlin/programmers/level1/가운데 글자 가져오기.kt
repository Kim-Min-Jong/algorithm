class Solution {
    fun solution(s: String): String {
        var answer = ""
        var len = s.length
        if(len % 2 == 0){
            return s[len/2-1].toString().plus(s[len/2].toString())
        }else{
            return s[len/2].toString()
        }
        return ""
    }
}