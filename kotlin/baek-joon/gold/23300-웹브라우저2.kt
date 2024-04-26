import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayDeque

val bw = BufferedWriter(OutputStreamWriter(System.out))
data class Problem(val number: Int, val difficulty: Int, val kind: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val (n, q) = readLine().split(" ").map { it.toInt() }
    val frontDq = ArrayDeque<Int>()
    var backDq = ArrayDeque<Int>()
    var currentPage = 0
    for (i in 0 until q) {
        val command = readLine().split(" ")
        when(command[0]) {
            "B" -> {
                if (backDq.isNotEmpty()) {
                    frontDq.addFirst(currentPage)
                    currentPage = backDq.removeLast()
                } else continue
            }
            "F" -> {
                if (frontDq.isNotEmpty()) {
                    backDq.addLast(currentPage)
                    currentPage = frontDq.removeFirst()
                } else continue
            }
            "A" -> {
                frontDq.clear()
                if (currentPage != 0) backDq.addLast(currentPage)
                currentPage = command[1].toInt()
            }
            "C" -> {
                // 방법 1 - 새로운 덱 만들어서 기존 덱 바꾸기 (약간 수정 필요)
               val dq: Deque<Int> = LinkedList()
               while (backDq.isNotEmpty()) {
                   if (dq.isNotEmpty()) dq.addLast(backDq.pollFirst())
                   else {
                       val tmp = backDq.pollFirst()
                       if (tmp != backDq.last) {
                           dq.addFirst(tmp)
                       }
                   }
               }
               backDq = dq

               // 방법 2 - 검색...
                var j = 1
                while (j < backDq.size) {
                    if (backDq[j - 1] == backDq[j]) {
                        backDq.removeAt(j--)
                    }
                    j++
                }
            }
        }
    }

    bw.write("$currentPage\n")
    bw.write("${if (backDq.isEmpty()) - 1 else backDq.reversed().joinToString(" ")}\n")
    bw.write("${if (frontDq.isEmpty()) - 1 else frontDq.joinToString(" ")}")

    bw.flush()
    bw.close()
    close()
}