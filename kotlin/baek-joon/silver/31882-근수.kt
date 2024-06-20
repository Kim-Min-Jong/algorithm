import java.io.BufferedWriter
import java.io.OutputStreamWriter
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val str = readLine()
    var sum = 0L
    var cnt = 0L
    
    for (i in 0 until n) {
        if (str[i] == '2')
            cnt++
        else cnt = 0L

        sum += cnt * (cnt + 1) / 2
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
    close()
}
