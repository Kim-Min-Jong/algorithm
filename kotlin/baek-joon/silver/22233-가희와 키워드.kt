import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val hashMap = hashMapOf<String, Boolean>()

    repeat(n) {
        val item = readLine()
        hashMap[item] = true
    }

    repeat(m) {
        readLine().split(",").forEach {
            hashMap.remove(it)
        }
        bw.write("${hashMap.size}\n")
    }

    bw.flush()
    bw.close()
    close()
}