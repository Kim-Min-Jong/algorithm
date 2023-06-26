import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map{it.toInt()}.sorted()
    var left = 0
    var right = list.size - 1
    var tmpValue = Int.MAX_VALUE
    var res1 = 0
    var res2 = 0
    while(left < right) {
        var tmp = list[left] + list[right]
        if(tmpValue > abs(tmp)) {
            tmpValue = abs(tmp)
            res1 = list[left]
            res2 = list[right]
        }
        when{
            tmp < 0 -> left++
            else -> right--
        }
    }

    bw.write("$res1 $res2")
    bw.flush()
    bw.close()
    close()
}