import java.util.*
class Solution {
    fun solution(numbers: IntArray): TreeSet<Int> {
        var ans:TreeSet<Int> = sortedSetOf()
        var sum = 0
        for(i in 0..numbers.size-1){
            for(j in 0..numbers.size-1){
                if(i == j)
                    continue
                else{
                    sum = numbers[i] + numbers[j]
                    ans.add(sum)
                }
            }
        }
        return ans
    }
}