import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map = hashMapOf<Int, Int>()
    repeat(n) {
        val (effect, name) = readLine().split(" ").map { it.toInt() }
        map[effect] = name
    }
    val r = readLine().toInt()
    repeat(r) {
        val list = readLine().split(" ").map { it.toInt() }
        val sb = StringBuilder()
        for (i in 1 until list.size) {
            if(map[list[i]] != null) {
                sb.append("${map[list[i]]} ")
            } else {
                sb.clear()
                sb.append("YOU DIED")
                break
            }
        }
        sb.apply {
            trim()
            append("\n")
        }
        bw.write(sb.toString())
    }

    bw.flush()
    bw.close()
    close()
}