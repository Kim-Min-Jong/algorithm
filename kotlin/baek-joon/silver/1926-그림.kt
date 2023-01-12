import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
var cnt = 0
lateinit var graph_1926: Array<IntArray>
fun main() = with(System.`in`.bufferedReader()) {
        val (a, b) = readLine().split(" ").map{it.toInt()}
        var res = 0
        val cntList = mutableListOf<Int>()
        graph_1926 = Array(a){IntArray(b){0} }
        for(i in 0 until a) {
            val st = StringTokenizer(readLine())
            for(j in 0 until b) {
                graph_1926[i][j] = st.nextToken().toInt()
            }
        }
        for ( i in 0 until a ) {
            for ( j in 0 until b ) {
                if (dfs_1926(i, j)) {
                    cntList.add(cnt)
                    cnt = 0
                }
            }
        }
        val len = cntList.size
        val max = cntList.maxOrNull()
        bw.write("${len}\n")
        if(max != null)
            bw.write("${max}\n")
        else bw.write("0")
    bw.flush()
    bw.close()
    close()
}
fun dfs_1926(x: Int, y: Int):Boolean {
    if(x < 0 || x >= graph_1926.size || y < 0 || y >= graph_1926[0].size)
        return false
    if(graph_1926[x][y] == 1){
        // 사방탐색
        graph_1926[x][y] = 0
        cnt++
        dfs_1926(x,y-1)
        dfs_1926(x,y+1)
        dfs_1926(x-1,y)
        dfs_1926(x+1,y)
        return true
    }
    return false
} // dfs 사방탐색