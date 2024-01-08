class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        var cnt = 0
        var r = 0
        for(s in seoul){
            cnt++
            if(s.equals("Kim")){
                r = cnt-1
                break
            }
        }
        answer = "김서방은 ${r}에 있다"
        return answer
    }
}