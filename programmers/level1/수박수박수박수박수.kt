class Solution {
    fun solution(n: Int): String {
        var answer = ""
        var str = StringBuilder()
        val su = "수"
        val back = "박"
        for(i in 1..n){
            if(i % 2 == 1)
                str = str.append(su)
            else str = str.append(back)
        }
        answer = str.toString()
        return answer
    }
}