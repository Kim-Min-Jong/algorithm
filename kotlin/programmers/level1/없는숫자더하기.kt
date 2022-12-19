class Solution {
    val arr = Array(10, {i -> i}).toIntArray().toList()
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        val newArr = arr.subtract(numbers.toList())
        for(i in newArr)
            answer += i
        
        return answer
    }
}