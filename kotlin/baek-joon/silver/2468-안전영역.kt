import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var graph_2468: Array<IntArray>
lateinit var visited: Array<BooleanArray>
val dx_2468 = intArrayOf(1, -1 , 0, 0)
val dy_2468 = intArrayOf(0, 0, -1, 1)
fun main() = with(System.`in`.bufferedReader()) {
    val tc = readLine().toInt()
    var max = 0
    val cntList = mutableListOf<Int>()
    graph_2468 = Array(tc) { IntArray(tc){0} }
    visited = Array(tc) { BooleanArray(tc) {false} }
    for(i in 0 until tc) {
        val st = StringTokenizer(readLine())
        for(j in 0 until tc) {
            val tmp = st.nextToken().toInt()
            graph_2468[i][j] = tmp
            if(tmp > max)
                max = tmp
        }
    }
    var answer = 0
    for(h in 0..max) {
        var cnt = 0
        visited = Array(tc) { BooleanArray(tc) {false} }
        for (i in 0 until tc) {
            for (j in 0 until tc) {
                if (!visited[i][j] && graph_2468[i][j] > h) {
                    bfs_2468(i, j, tc, h)
                    cnt++
                }
            }
        }
        cntList.add(cnt)
    }
    bw.write("${cntList.maxOrNull()}")
    bw.flush()
    bw.close()
    close()
}
fun bfs_2468(x: Int, y: Int, tc: Int, h: Int) {
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.add(Pair(x,y))
    while(queue.isNotEmpty()) {
        val tmp = queue.poll()
        for(a in dx_2468.indices) {
            val dx = dx_2468[a] + tmp.first
            val dy = dy_2468[a] + tmp.second
            if(dx < 0 || dx >= tc || dy < 0 || dy >= tc) continue
            if(graph_2468[dx][dy] > h && !visited[dx][dy]) {
                visited[dx][dy] = true
                queue.add(Pair(dx,dy))
            }
        }
    }
} // bfs