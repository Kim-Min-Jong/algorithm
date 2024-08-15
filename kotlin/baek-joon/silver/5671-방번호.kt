import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        val list = readLine() ?: break

        val (n, m) = list.split(" ").map { it.toInt() }
        var cnt = 0

        for (i in n..m) {
            if(checkDupNum(i))
                cnt++
        }
        bw.write("$cnt\n")
    }

    bw.flush()
    bw.close()
    close()
}

fun checkDupNum(num: Int): Boolean {
    return num.toString().groupBy { it }.map { it.key to it.value.size }.count { it.second >= 2 } < 1
}