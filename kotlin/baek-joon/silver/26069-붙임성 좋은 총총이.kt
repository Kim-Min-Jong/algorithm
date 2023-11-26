import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val set = mutableSetOf("ChongChong")
    for(i in 1..n) {
        val (key, value) = readLine().split(" ")
        if(key in set) set.add(value)
        if(value in set) set.add(key)
    }

    bw.write("${set.size}")

    bw.flush()
    bw.close()
    close()
}