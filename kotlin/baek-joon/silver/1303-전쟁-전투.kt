import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
var cnt = 0
lateinit var charGraph: Array<CharArray>

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{ it.toInt() }
    val whiteCntList = mutableListOf<Int>()
    val blueCntList = mutableListOf<Int>()

    charGraph = Array(m){CharArray(n){'x'} }
    for(i in 0 until m) {
        val arr = readLine().toCharArray()
        for(j in 0 until n) {
            charGraph[i][j] = arr[j]
        }
    }

    for ( i in 0 until m ) {
        for ( j in 0 until n ) {
            if (dfs_1303_w(i, j)) {
                whiteCntList.add(cnt)
                cnt = 0
            }
        }
    }
    for ( i in 0 until m ) {
        for ( j in 0 until n ) {
            if (dfs_1303_b(i, j)) {
                blueCntList.add(cnt)
                cnt = 0
            }
        }
    }
    var sum = 0
    whiteCntList.forEach { num ->
        sum += num * num
    }
    bw.write("$sum")
    sum = 0
    blueCntList.forEach { num ->
        sum += num * num
    }
    bw.write(" $sum")
    bw.flush()
    bw.close()
    close()
}
fun dfs_1303_w(x: Int, y: Int): Boolean {
    if (x < 0 || x >= charGraph.size || y < 0 || y >= charGraph[0].size)
        return false
    if(charGraph[x][y] == 'W') {
        charGraph[x][y] = 'x'
        ++cnt
        dfs_1303_w(x,y-1)
        dfs_1303_w(x,y+1)
        dfs_1303_w(x-1,y)
        dfs_1303_w(x+1,y)
        return true
    }
    return false
}
fun dfs_1303_b(x: Int, y: Int): Boolean {
    if (x < 0 || x >= charGraph.size || y < 0 || y >= charGraph[0].size)
        return false
    if(charGraph[x][y] == 'B') {
        charGraph[x][y] = 'x'
        ++cnt
        dfs_1303_b(x,y-1)
        dfs_1303_b(x,y+1)
        dfs_1303_b(x-1,y)
        dfs_1303_b(x+1,y)
        return true
    }
    return false
}