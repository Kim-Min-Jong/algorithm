import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().split("-")
    val list = mutableListOf<Int>()

    for(i in n.indices) {
        var sum = 0
        if("+" in n[i]) {
            val a = n[i].split("+")
            for(j in 0 until a.size) {
                sum += a[j].toInt()
            }
            list.add(sum)
        } else {
            list.add(n[i].toInt())
        }
    }
    var a = list[0]
    for(i in 1 until list.size) {
        a -= list[i]
    }
    bw.write("$a")

    bw.flush()
    bw.close()
    close()
}