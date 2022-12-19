import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.min

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val (n, m) = readLine().split(" ").map{it.toInt()}

    val five = counting(n, 5) - counting(m, 5) - counting(n - m, 5)
    val two = counting(n, 2) - counting(m, 2) - counting(n - m, 2)

    bw.write(min(two, five).toString())

    bw.flush()
    bw.close()
    close()
}
fun counting(n:Int, kind:Int):Int{
    var cnt = 0
    var tmp:Int = n
    while(tmp > 0){
        tmp /= kind
        cnt += tmp
    }
    return cnt
}