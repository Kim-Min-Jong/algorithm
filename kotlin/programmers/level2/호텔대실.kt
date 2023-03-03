import java.util.*
class Solution {
    fun solution(book_time: Array<Array<String>>): Int {
        var answer: Int = 0
        val queue = PriorityQueue<Int>()
        val classList = mutableListOf<Time>()
        book_time.forEach { subList ->
            val startList = subList[0].split(":")
            val endList = subList[1].split(":")
            val start = startList[0].toInt() * 60 + startList[1].toInt() 
            val end = endList[0].toInt() * 60 + endList[1].toInt() + 10
            classList.add(Time(start, end))
        }
        classList.sortWith(compareBy<Time> { it.start })
        queue.add(classList[0].end)
        for(i in 1 until classList.size) {
            if(classList[i].start < queue.peek())
                queue.add(classList[i].end)
            else {
                queue.poll()
                queue.add(classList[i].end)
            }
        }
        answer = queue.size
        return answer
    }
    data class Time(
        val start: Int,
        val end:Int
    )
}