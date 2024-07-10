import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()

    repeat(n) {
        val m = readLine().toInt()
        val list = mutableListOf<Pair<String, Int>>()
        repeat(m) {
            val (name, cnt) = readLine().split(" ")
            list.add(name to cnt.toInt())
        }

        bw.write("${list.maxByOrNull { it.second }!!.first}\n")
    }
    
    bw.flush()
    bw.close()
    close()
}