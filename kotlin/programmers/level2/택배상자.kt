import java.util.Stack
class Solution {
    fun solution(order: IntArray): Int {
        var answer: Int = 0
        val stack = Stack<Int>()
        var idx = 0
        
        for(i in 1..order.size) {
            if (order[idx] == i) {
                answer++
                idx++
            } else {
                stack.push(i)
            }
            
            while(stack.isNotEmpty() && order[idx] == stack.peek()) {
                stack.pop()
                answer++
                idx++
            }
        }
        
        return answer
    }
}