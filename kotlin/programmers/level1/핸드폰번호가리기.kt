class Solution {
    fun solution(phone_number: String): String {
        var answer = StringBuilder()
        val len = phone_number.length
        for(i in 0..len- 5){
            answer.append("*")
        }
        answer.append(phone_number.substring(len-4,len))
        return answer.toString()
    }
}