import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = Array<IntArray>(100){ IntArray(100){0} }
    var cnt = 0

    repeat(n) {
        val (x, y) = readLine().split(" ").map{it.toInt()}
        for(i in x until x+10) {
            for(j in y until y+10) {
                arr[i][j] = 999
            }
        }
    }
    for(i in 0 until 100) {
        for(j in 0 until 100) {
            if(arr[i][j] == 999)
                cnt++
        }
    }
    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}