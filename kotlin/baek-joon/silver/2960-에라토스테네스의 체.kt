import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{it.toInt()}
    val boolArr = BooleanArray(n+1){false}
    var cnt = 0
    for(i in 2..n) {
        for(j in i..n step i) {
            if(!boolArr[j]) {
                cnt++
                boolArr[j] = true
            }
            if(cnt == m){
                bw.write("$j")
                bw.flush()
                bw.close()
                close()
                return@with
            }
        }
    }
}