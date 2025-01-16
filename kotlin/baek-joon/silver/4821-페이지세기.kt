import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        val n = readLine().toInt()
        if (n == 0) break
        val list = readLine().split(",")
        val pages = list.map{ it.split("-").map { it.toInt() } }
        val set = mutableSetOf<Int>()

        for (page in pages) {
            if (page.first() > page.last()) continue
            else {
                (page.first()..page.last()).forEach {
                    if (it <= n) {
                        set.add(it)
                    }
                }
            }
        }
        bw.write("${set.size}\n")
    }

    closeBW()
    close()
}