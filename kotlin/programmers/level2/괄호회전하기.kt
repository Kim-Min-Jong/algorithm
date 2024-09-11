import java.util.*
class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
    val queue:Queue<String> = LinkedList<String>().apply {
        s.forEach { add(it.toString()) }
    }
    
    for (i in 0 until queue.size) {
        val stack: Stack<String> = Stack()
        for (str in queue) {
            if (stack.isEmpty()) stack.add(str)
            else {
                if (stack.peek() == "{" && str == "}") stack.pop()
                else if (stack.peek() == "[" && str == "]") stack.pop()
                else if (stack.peek() == "(" && str == ")") stack.pop()
                else stack.add(str)
            }
        }
        answer += if (stack.isEmpty()) 1 else 0
        queue.add(queue.poll())
    }
        
        return answer
    }
}