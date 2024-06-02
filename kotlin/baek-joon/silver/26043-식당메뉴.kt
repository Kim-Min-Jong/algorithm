import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

data class Student(val id: Int, val favoriteMenu: Int)
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    // 좋아함
    val listA = mutableListOf<Int>()
    // 좋아하지 않음
    val listB = mutableListOf<Int>()
    // 못먹음
    val listC = mutableListOf<Int>()
    val queue: Queue<Student> = LinkedList()
    repeat(n) {
        val command = readLine().split(" ").map { it.toInt() }
        when(command.first()) {
            1 -> {
                queue.add(Student(command[1], command[2]))
            }
            2 -> {
                val student = queue.poll()
                val menu = command[1]
                if (student.favoriteMenu == menu) {
                    listA.add(student.id)
                } else {
                    listB.add(student.id)
                }
            }
        }
    }

    // 못 먹은 사람 처리
    while (queue.isNotEmpty()) {
        listC.add(queue.poll().id)
    }

    bw.write(if (listA.isEmpty()) "None\n" else listA.sorted().joinToString(" ") + "\n")
    bw.write(if (listB.isEmpty()) "None\n" else listB.sorted().joinToString(" ") + "\n")
    bw.write(if (listC.isEmpty()) "None\n" else listC.sorted().joinToString(" ") + "\n")

    bw.flush()
    bw.close()
    close()
}