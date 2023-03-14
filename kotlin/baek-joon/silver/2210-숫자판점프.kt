import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var graph: Array<IntArray>
lateinit var resultSet: MutableSet<String>
lateinit var tmp: MutableList<Char>
fun main() = with(System.`in`.bufferedReader()) {
    graph = Array(5) { IntArray(5) {0} }
    tmp = MutableList<Char>(6){'0'}
    resultSet = mutableSetOf()
    for(i in 0 until 5){
        val list = readLine().split(" ").map{ it.toInt() }
        for(j in list.indices) {
            graph[i][j] = list[j]
        }
    }
    for (i in 0 until 5) {
        for (j in 0 until 5) {
            dfs_2210(0, i, j)
        }
    }

    bw.write("${resultSet.size}")

    bw.flush()
    bw.close()
    close()
}
fun dfs_2210(length: Int, x:Int, y:Int) {
    if(length == 6) {
        val res = "${tmp[0]}${tmp[1]}${tmp[2]}${tmp[3]}${tmp[4]}${tmp[5]}"
        resultSet.add(res)
    } else {
        if (x < 0 || x >= graph.size || y < 0 || y >= graph[0].size)
            return
        tmp[length] = graph[x][y].toChar()
        dfs_2210(length + 1, x, y - 1)
        dfs_2210(length + 1, x, y + 1)
        dfs_2210(length + 1, x - 1, y)
        dfs_2210(length + 1, x + 1, y)
    }
}