import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var charGraph: Array<CharArray>
var sheep = 0
var wolf = 0

fun main() = with(System.`in`.bufferedReader()) {
    val (m, n) = readLine().split(" ").map{it.toInt()}
    var totalSheep = 0
    var totalWolf = 0
    charGraph = Array(m){CharArray(n){'0'} }
    for(i in 0 until m) {
        val st = readLine()
        for(j in 0 until n) {
            charGraph[i][j] = st[j]
        }
    }
    for ( i in 0 until m) {
        for ( j in 0 until n ) {
            if(charGraph[i][j] != '#') {
                sheep = 0
                wolf = 0
                dfs_3187(i, j)
                if(sheep > wolf) totalSheep += sheep
                else totalWolf += wolf
            }
        }
    }

    bw.write("$totalSheep $totalWolf")

    bw.flush()
    bw.close()
    close()
}
fun dfs_3187(x: Int, y: Int) {
    if (x < 0 || x >= charGraph.size || y < 0 || y >= charGraph[0].size)
        return
    else {
        if(charGraph[x][y] == 'v') wolf++
        if(charGraph[x][y] == 'k') sheep++
        if(charGraph[x][y] != '#') {
            charGraph[x][y] = '#'
            dfs_3187(x, y - 1)
            dfs_3187(x, y + 1)
            dfs_3187(x - 1, y)
            dfs_3187(x + 1, y)
        }
    }
}