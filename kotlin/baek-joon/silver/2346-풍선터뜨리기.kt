import java.util.*

data class Balloon(val idx: Int, val paper: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val num = readLine().toInt()
    val deque : Deque<Balloon> = ArrayDeque()
    val st = StringTokenizer(br.readLine())
    val sb = StringBuilder()

    for(i in 1 .. num) {
        deque.add(Balloon(i, st.nextToken().toInt()))
    }

    while (deque.isNotEmpty()) {
        val pivot = deque.poll()
        sb.append("${pivot.idx} ")

        if(pivot.paper > 0) {
            for(i in 1 until paper) {
                deque.addLast(deque.pollFirst())
            }
        } else {
            for(i in paper until 0) {
                deque.addFirst(deque.pollLast())
            }
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
    close()
}