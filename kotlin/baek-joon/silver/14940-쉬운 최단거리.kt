import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

lateinit var visited: Array<BooleanArray>
lateinit var graph: Array<IntArray>
lateinit var distance: Array<IntArray>
data class EndPoint(val x: Int, val y: Int)
lateinit var endPoint: EndPoint
val dx = intArrayOf(0, 0, -1, 1)
val dy = intArrayOf(1, -1, 0, 0)

fun main() = with(System.`in`.bufferedReader()) {

    val (h, w) = readLine().split(" ").map { it.toInt() }
    graph = Array(h) { IntArray(w) }
    distance = Array(h) { IntArray(w) }
    visited = Array(h) { BooleanArray(w) { false } }
    for (i in 0 until h) {
        val st = StringTokenizer(readLine())
        for (j in 0 until st.countTokens()) {
            val value = st.nextToken().toInt()
            if (value == 2) endPoint = EndPoint(i, j)
            graph[i][j] = value
            distance[i][j] = 0

        }
    }

    bfs_14940(endPoint.x, endPoint.y)

    for (i in distance.indices) {
        for (j in distance[i].indices) {
            if (graph[i][j] == 1 && visited[i][j].not()) {
                bw.write("-1 ")
            } else {
                bw.write("${distance[i][j]} ")
            }
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
    close()
}

fun bfs_14940(x: Int, y: Int) {
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.add(x to y)
    visited[x][y] = true

    while (queue.isNotEmpty()) {
        val tmp = queue.poll()
        for (i in 0 until 4) {
            val tmpX = tmp.first + dx[i]
            val tmpY = tmp.second + dy[i]
                // 넘어갈 때
                if (tmpX < 0 || tmpY < 0 || tmpX >= graph.size || tmpY >= graph[0].size
                    || visited[tmpX][tmpY]
                    || graph[tmpX][tmpY] == 0)
                    continue

            queue.add(tmpX to tmpY)
            distance[tmpX][tmpY] += distance[tmp.first][tmp.second] + 1
            visited[tmpX][tmpY] = true
        }
    }
}