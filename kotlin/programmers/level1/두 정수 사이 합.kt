class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        if(b >= a){
            for(i in a..b)
              answer += i.toLong()
        }else{
             for(i in a downTo b step 1)
                answer += i.toLong()
        }
            return answer
    }
}