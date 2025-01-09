import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val set = hashSetOf<String>()
    repeat(n) {
        val list = readLine().split(" ")
        val appList = list.subList(1, list.size)

        for (i in 0 until list.first().toInt()) {
            if (appList[i] !in set) {
                bw.write("${appList[i]} ")
                set.add(appList[i])
                break
            }
        }
    }

    closeBW()
    close()
}