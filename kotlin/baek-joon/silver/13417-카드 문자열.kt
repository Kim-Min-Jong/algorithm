import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()

    repeat(n) {
        val deque: Deque<String> = LinkedList()
        val m = readLine().toInt()
        val list = readLine().split(" ")

        for (i in 0 until m) {
            if (i == 0) {
                deque.add(list[0])
            } else if (deque.peekFirst() >= list[i]) {
                deque.addFirst(list[i])
            } else {
                deque.addLast(list[i])
            }
        }
        bw.write("${deque.joinToString("")}\n")
    }


    bw.flush()
    bw.close()
    close()
}