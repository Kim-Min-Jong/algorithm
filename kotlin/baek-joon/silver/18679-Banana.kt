import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val tc = readLine().toInt()
    val map = hashMapOf<String, String>()
    repeat(tc) {
        val (key, value) = readLine().split("=").map { it.trim() }
        map[key] = value
    }
    val n = readLine().toInt()
    repeat(n) {
        val length = readLine().toInt()
        val str = readLine().split(" ").toMutableList()
        for (idx in str.indices) {
            if(map.keys.contains(str[idx])) {
                str[idx] = map[str[idx]].toString()
            }
        }
        bw.write("${str.joinToString(" ")}\n")
    }

    bw.flush()
    bw.close()
    close()
}