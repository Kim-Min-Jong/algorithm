import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Int>()
    var res = 0
    repeat(n) {
        list.add(readLine().toInt())
    }
    list.sortDescending()
    for(i in 0 until list.size) {
        if(i % 3 == 2)
            continue
        res += list[i]
    }
    bw.write("$res")

    bw.flush()
    bw.close()
    close()
}