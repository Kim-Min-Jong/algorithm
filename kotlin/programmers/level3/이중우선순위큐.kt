import java.util.*
class Solution {
    fun solution(operations: Array<String>): IntArray {
        var answer = intArrayOf(0,0)
        val maxHeap = PriorityQueue<Int>(Collections.reverseOrder())
        val minHeap = PriorityQueue<Int>()
        operations.forEach {
            val (command, num) = it.split(" ")
            val intNum = num.toInt()
            when(command) {
                "I" -> {
                    maxHeap.add(intNum)
                    minHeap.add(intNum)
                }
                "D" -> {
                    when(intNum) {
                        1 -> {
                            val tmp = maxHeap.poll()
                            minHeap.remove(tmp)
                        }
                        -1 -> {
                            if(minHeap.size != 0) {
                                val tmp = minHeap.poll()
                                maxHeap.remove(tmp)
                            }
                        }
                    }
                }
            }
        }
        if(maxHeap.size > 1)
            answer = intArrayOf(maxHeap.first(), minHeap.first())
        return answer
    }
}