import java.io.OutputStreamWriter
import java.io.BufferedWriter
import java.util.*

lateinit var graph_4963: Array<IntArray>
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        val (a, b) = readLine().split(" ") .map{it.toInt()}
        if(a==0&&b==0) break
        var cnt = 0
        graph_4963 = Array(b){IntArray(a){0} }
        for(i in 0 until b) {
            val st = StringTokenizer(readLine())
            for(j in 0 until a) {
                graph_4963[i][j] = st.nextToken().toInt()
            }
        }
        for ( i in 0 until b ) {
            for ( j in 0 until a ) {
                if (dfs_4963(i, j)) {
                    cnt++
                }
            }
        }
        bw.write("$cnt\n")
    }
    
    bw.flush()
    bw.close()
    close()
}
fun dfs_4963(y: Int, x: Int):Boolean {
    if(x < 0 || x >= graph_4963[0].size || y < 0 || y >= graph_4963.size)
        return false
    if(graph_4963[y][x] == 1){
        // 팔방탐색
        graph_4963[y][x] = 0
        dfs_4963(y,x-1)
        dfs_4963(y,x+1)
        dfs_4963(y-1,x)
        dfs_4963(y+1,x)
        dfs_4963(y-1,x-1)
        dfs_4963(y-1,x+1)
        dfs_4963(y+1,x-1)
        dfs_4963(y+1,x+1)
        return true
    }
    return false
}