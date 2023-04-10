import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val MAX = 1000001
val visit = BooleanArray(MAX)
val dist = IntArray(MAX)

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    bfs(n, k)
}

fun bfs(n: Int, k: Int) {
    val q: Queue<Int> = LinkedList()
    q.offer(n)
    visit[n] = true

    while (q.isNotEmpty()) {
        val x = q.poll()
        if (x == k) {
            println(dist[x])
            return
        }
        if (x - 1 >= 0 && !visit[x - 1]) {
            q.offer(x - 1)
            visit[x - 1] = true
            dist[x - 1] = dist[x] + 1
        }
        if (x + 1 < MAX && !visit[x + 1]) {
            q.offer(x + 1)
            visit[x + 1] = true
            dist[x + 1] = dist[x] + 1
        }
        if (2 * x < MAX && !visit[2 * x]) {
            q.offer(2 * x)
            visit[2 * x] = true
            dist[2 * x] = dist[x] + 1
        }
    }
}
