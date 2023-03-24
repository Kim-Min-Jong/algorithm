import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
var cnt = 0
fun main() = with(System.`in`.bufferedReader()) {
    val m = readLine().toInt()
    val list = HashMap<String, Int>()
    val overTakingList = arrayOfNulls<Int>(m)
    var mapIdx = 0
    repeat(m) {
        val carIn = readLine()
        list[carIn] = mapIdx++
    }
    repeat(m) {
        val carOut = readLine()
        overTakingList[it] = list[carOut]
    }

    for (i in 0 until m - 1) {
        for (j in i + 1 until m) {
            if (overTakingList[i]!! > overTakingList[j]!!) {
                cnt++
                break
            }
        }
    }
    bw.write("$cnt")
    bw.flush()
    bw.close()
    close()
}