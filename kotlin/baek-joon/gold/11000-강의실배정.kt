import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val queue = PriorityQueue<Int>()
    val list = mutableListOf<Pair<Int,Int>>()
    repeat(n) {
        val (a,b) = readLine().split(" ").map{it.toInt()}
        list.add(Pair(a,b))
    }
    // 시작시간 순대로 정렬
    list.sortBy { it.first }
    // 첫번째 끝나는 시간 삽입
    queue.add(list[0].second)
    // 시간표 순회하면서
    for(i in 1 until list.size) {
        // 다음 시간 시작보다 전 시간 끝이 더 늦으면
        if(list[i].first < queue.peek()) {
            // 새 강의실
            queue.add(list[i].second)
        } else {
            // 아니면 그 강의실 쓸 수 있으므로 queue에서 제거하고 다음 끝 다시 삽입
            queue.poll()
            queue.add(list[i].second)
        }
    }
    bw.write("${queue.size}")

    bw.flush()
    bw.close()
    close()
} // sort, greedy