import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    for(i in 0 until n) {
        val m = readLine().toInt()
        val list = mutableListOf<String>()
        var flag = false
        for(j in 0 until m) {
            val num = readLine()
            list.add(num)
        }
        list.sort()
        for(k in 0 until m - 1) {
            if(list[k+1].startsWith(list[k])) {
                flag = true
                break
            }
        }
        if(flag) bw.write("NO\n")
        else bw.write("YES\n")
    }

    bw.flush()
    bw.close()
    close()
}