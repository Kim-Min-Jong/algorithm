class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var default = IntArray(n+1){1}
        var sortedLost = lost.sorted()
        var sortedReserve = reserve.sorted()
        var answer = -1
        for(i in sortedLost){
            default[i]--
        } 
        for(i in sortedReserve){
            default[i]++
        } 
        for(i in 1..n){
            if(default[i]==0){
                if(default[i-1] == 2){
                    default[i-1]--
                    default[i]++
                } 
                else if(i<n){
                    if(default[i+1] == 2){
                        default[i+1]--
                        default[i]++
                    }
                }
            }
        }
        for(i in default){
            if(i==2) answer += 1
            else answer += i
        }
        return answer
    }
}