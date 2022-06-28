class Solution {
    fun solution(n: Int): Long {
        var answer = 0
        var n1 = 2
        var n2 = 3
        if(n==1) return 1
        else if(n==2) return 2
        else if(n==3) return 3
        else{
            for(i in 4..n){
                answer = (n1+n2)%1234567
                n1 = n2
                n2 = answer
            }
        }
        return answer.toLong()
    }
}