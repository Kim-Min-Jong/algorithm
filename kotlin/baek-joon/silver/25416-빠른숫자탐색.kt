import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

var cnt = -1
val dx = intArrayOf(0, 0, -1, 1)
val dy = intArrayOf(1, -1, 0, 0)
lateinit var visited: Array<BooleanArray>
lateinit var graph: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()) {
    graph = Array(5) { IntArray(5) { 0 } }
    visited = Array(5) { BooleanArray(5) { false } }

    (0 until 5).forEach { x ->
        val st = StringTokenizer(readLine())
        (0 until 5).forEach { y ->
            graph[x][y] = st.nextToken().toInt()
        }
    }

    val (r, c) = readLine().split(" ").map { it.toInt() }

    bw.write("${bfs_25416(r, c)}")

    bw.flush()
    bw.close()
    close()
}

fun bfs_25416(x: Int, y: Int): Int {
    val queue: Queue<MutableList<Int>> = LinkedList()
    queue.add(mutableListOf(x, y, 0))
    visited[x][y] = true

    while (queue.isNotEmpty()) {
        val tmp = queue.poll()

        if (graph[tmp[0]][tmp[1]] == 1) {
            return tmp[2]
        }

        for (i in 0 until 4) {
            val nx = tmp[0] + dx[i]
            val ny = tmp[1] + dy[i]
            if (nx >= 0 && ny >= 0 && nx < 5 && ny < 5 && !visited[nx][ny] && graph[nx][ny] != -1) {
                visited[nx][ny] = true
                queue.add(mutableListOf(nx, ny, tmp[2] + 1))
            }
        }
    }
    return -1
}