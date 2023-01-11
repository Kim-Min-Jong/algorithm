import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
var cnt = 0
lateinit var graph_2667: Array<IntArray>
fun main() = with(System.`in`.bufferedReader()) {
        val n = readLine().toInt()
        var res = 0
        val cntList = mutableListOf<Int>()
        graph_2667 = Array(n){IntArray(n){0} }
        for(i in 0 until n) {
            val st = readLine().chunked(1).map{it.toInt()}
            for(j in 0 until n) {
                graph_2667[i][j] = st[j]
            }
        }
        for ( i in 0 until n ) {
            for ( j in 0 until n ) {
                if (dfs_2667(i, j)) {
                    cntList.add(cnt)
                    res++
                    cnt = 0
                }
            }
        }
        bw.write("$res\n")
        cntList.sorted().forEach {
            bw.write("$it\n")
        }
    
    bw.flush()
    bw.close()
    close()
}
fun dfs_2667(x: Int, y: Int):Boolean {
    if(x < 0 || x >= graph_2667[0].size || y < 0 || y >= graph_2667.size)
        return false
    if(graph_2667[x][y] == 1){
        // 사방탐색
        graph_2667[x][y] = 0
        cnt++
        dfs_2667(x,y-1)
        dfs_2667(x,y+1)
        dfs_2667(x-1,y)
        dfs_2667(x+1,y)

        return true
    }
    return false
}