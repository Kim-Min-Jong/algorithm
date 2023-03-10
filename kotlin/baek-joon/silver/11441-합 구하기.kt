import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val list = readLine().split(" ").map{it.toInt()}
    val m = readLine().toInt()

    // 누적합을 저장한 배열
    val p = IntArray(n+1)
    for (i in 1..n) {
        p[i] = p[i-1] + list[i-1]
    }

    repeat(m){
        val (a,b) = readLine().split(" ").map{it.toInt()-1}
        // 구간합 계산
        val sum = p[b+1] - p[a]

        bw.write("$sum\n")
    }
    bw.flush()
    bw.close()
    close()
}