import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val tc = readLine().toInt()

    repeat(tc) {
        var n = readLine().toInt()
        val list = mutableListOf<Int>()
        var div = 2
        while(n != 1) {
            if(n % div == 0) {
                n /= div
                list.add(div)
            } else div++
        }
        list.groupBy { it }.map{it.key to it.value.size}.forEach {
            bw.write("${it.first} ${it.second}\n")
        }
    }

    bw.flush()
    bw.close()
    close()
}